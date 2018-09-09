package com.tumblr.jumblr.types;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/**
 * This class is list of Post
 * 
 * @author piclane
 */
public class Posts implements List<Post>, RandomAccess {
	/** a list of posts */
	private final List<Post> posts;
	
	/** total count of posts */
	private final int totalCount;

	/**
	 * Constructor
	 * 
	 * @param posts a list of posts
	 * @param totalCount total count of posts
	 */
	public Posts(List<Post> posts, int totalCount) {
		this.posts = posts;
		this.totalCount = totalCount;
	}
	
	/**
	 * Get the total count of posts
	 *
	 * @return totalCount total count of posts
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * @see java.util.List#size()
	 */
	public int size() {
		return posts.size();
	}

	/**
	 * @see java.util.List#isEmpty()
	 */
	public boolean isEmpty() {
		return posts.isEmpty();
	}

	/**
	 * @see java.util.List#contains(java.lang.Object)
	 */
	public boolean contains(Object o) {
		return posts.contains(o);
	}

	/**
	 * @see java.util.List#iterator()
	 */
	public Iterator<Post> iterator() {
		return posts.iterator();
	}

	/**
	 * @see java.util.List#toArray()
	 */
	public Object[] toArray() {
		return posts.toArray();
	}

	/**
	 * @see java.util.List#toArray(java.lang.Object[])
	 */
	public <T> T[] toArray(T[] a) {
		return posts.toArray(a);
	}

	/**
	 * @see java.util.List#add(java.lang.Object)
	 */
	public boolean add(Post e) {
		return posts.add(e);
	}

	/**
	 * @see java.util.List#remove(java.lang.Object)
	 */
	public boolean remove(Object o) {
		return posts.remove(o);
	}

	/**
	 * @see java.util.List#containsAll(java.util.Collection)
	 */
	public boolean containsAll(Collection<?> c) {
		return posts.containsAll(c);
	}

	/**
	 * @see java.util.List#addAll(java.util.Collection)
	 */
	public boolean addAll(Collection<? extends Post> c) {
		return posts.addAll(c);
	}

	/**
	 * @see java.util.List#addAll(int, java.util.Collection)
	 */
	public boolean addAll(int index, Collection<? extends Post> c) {
		return posts.addAll(index, c);
	}

	/**
	 * @see java.util.List#removeAll(java.util.Collection)
	 */
	public boolean removeAll(Collection<?> c) {
		return posts.removeAll(c);
	}

	/**
	 * @see java.util.List#retainAll(java.util.Collection)
	 */
	public boolean retainAll(Collection<?> c) {
		return posts.retainAll(c);
	}

	/**
	 * @see java.util.List#clear()
	 */
	public void clear() {
		posts.clear();
	}

	/**
	 * @see java.util.List#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
		return posts.equals(o);
	}

	/**
	 * @see java.util.List#hashCode()
	 */
	public int hashCode() {
		return posts.hashCode();
	}

	/**
	 * @see java.util.List#get(int)
	 */
	public Post get(int index) {
		return posts.get(index);
	}

	/**
	 * @see java.util.List#set(int, java.lang.Object)
	 */
	public Post set(int index, Post element) {
		return posts.set(index, element);
	}

	/**
	 * @see java.util.List#add(int, java.lang.Object)
	 */
	public void add(int index, Post element) {
		posts.add(index, element);
	}

	/**
	 * @see java.util.List#remove(int)
	 */
	public Post remove(int index) {
		return posts.remove(index);
	}

	/**
	 * @see java.util.List#indexOf(java.lang.Object)
	 */
	public int indexOf(Object o) {
		return posts.indexOf(o);
	}

	/**
	 * @see java.util.List#lastIndexOf(java.lang.Object)
	 */
	public int lastIndexOf(Object o) {
		return posts.lastIndexOf(o);
	}

	/**
	 * @see java.util.List#listIterator()
	 */
	public ListIterator<Post> listIterator() {
		return posts.listIterator();
	}

	/**
	 * @see java.util.List#listIterator(int)
	 */
	public ListIterator<Post> listIterator(int index) {
		return posts.listIterator(index);
	}

	/**
	 * @see java.util.List#subList(int, int)
	 */
	public List<Post> subList(int fromIndex, int toIndex) {
		return posts.subList(fromIndex, toIndex);
	}
	
}
