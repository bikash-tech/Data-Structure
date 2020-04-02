package com.stack.linkedlist;

public class Node {
	private Node next;
	private Object data;

	public Node() {
		super();
	}

	public Node(Node next, Object data) {
		super();
		this.next = next;
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

}
