package com.bikash.doubly.linkedlist;

/**
 * Custom Doubly LinkedList with all possible operations
 * 
 * @author Bikash Kumar
 * @version 1.0
 * 
 *
 */
public class DoublyLinkedList {
	private DNode head, tail;
	private int size;

	public DoublyLinkedList() {
		head = new DNode(null,null,Integer.MIN_VALUE);
		tail = new DNode(head, null, Integer.MIN_VALUE);
		head.setNextNode(tail);
		size = 0;
	}

	/**
	 * Get Size of the List
	 * @return {@link Integer}
	 */
	public int getSize() {
		return size;
	}

	/** 
	 * Check for empty-ness
	 * @return {@link Boolean}
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void insertAtFirst(int data) {
		DNode node = new DNode(null,head.getNextNode(),data);
//		node.setPrevNode(node);
		head = node;
		size ++;
	}
}
