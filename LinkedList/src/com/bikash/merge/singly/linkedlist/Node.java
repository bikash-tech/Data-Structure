package com.bikash.merge.singly.linkedlist;

/**
 * @author Bikash Kumar
 *
 */
public class Node {
	private Node next;
	private int data;

	public Node(Node next, int data) {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Node [next=" + next + ", data=" + data + "]";
	}

}
