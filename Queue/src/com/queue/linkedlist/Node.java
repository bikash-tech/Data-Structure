package com.queue.linkedlist;

/**
 * @author Bikash Kumar
 *
 */
public class Node {
	private int data;
	private Node next;

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
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

}
