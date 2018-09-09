package com.tumblr.jumblr.types;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 * 
 * @author piclane
 */
public class UrlJsonAdapter extends TypeAdapter<String> {

	/**
	 * @see com.google.gson.TypeAdapter#write(com.google.gson.stream.JsonWriter, java.lang.Object)
	 */
	@Override
	public void write(JsonWriter out, String value) throws IOException {
		out.value(value);
	}

	/**
	 * @see com.google.gson.TypeAdapter#read(com.google.gson.stream.JsonReader)
	 */
	@Override
	public String read(JsonReader in) throws IOException {
		return expandSourceUrl(in.nextString());
	}

	/**
	 * sourceUrl を普通の URL に変換します
	 * ※普通じゃ無いやつの例↓
	 * http://t.umblr.com/redirect?z=https%3A%2F%2Ftwitter.com%2Fkahorin06281%2Fstatus%2F795616025559478272&t=OTY2M2M4MzgxNWExYjRlNjg0YTNmZWVjODQ4ZGIzMTk1ZjQyOTJmMywxNTMyMTI4MzcxOTk%3D
	 * 
	 * @param sourceUrl ソースURL
	 * @return 普通になった URL
	 */
	public static String expandSourceUrl(String sourceUrl) {
		URI uri;
		try {
			uri = new URI(sourceUrl);
		} catch (URISyntaxException e) {
			return sourceUrl;
		}
		
		if(!"/redirect".equals(uri.getPath())) {
			return sourceUrl;
		}
		
		for(NameValuePair param: URLEncodedUtils.parse(uri, StandardCharsets.UTF_8.name())) {
			if("z".equals(param.getName())) {
				return param.getValue();
			}
		}
		
		return sourceUrl;
	}
}
