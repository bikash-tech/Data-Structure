package com.bikash.linkedlist;

/**
 * Custom LinkedList with all possible operations 
 * 
 * @author Bikash Kumar
 *
 */
public class LinkedList {
	int size;
	Node start;

	public LinkedList() {
		size = 0;
		start = null;
	}

	/**
	 * Display all Node's data 
	 * Take one pointer node to traverse the whole List
	 */
	public void viewList() {
		Node node = null;
		if (isEmpty()) {
			System.out.println("List is Empty.");
		} else {
			// initialize the temporary node to start node
			node = start;
			// print from first element to last element of the List
			for (int i = 0; i < size; i++) {
				System.out.print(node.getData()+"->");
				// get next node address
				node = node.getNext();
			}
		}
	}

	/**
	 * If start node is null, then return true
	 * @return boolean
	 */
	public boolean isEmpty() {
		if (start == null)
			return true;
		else
			return false;
	}

	/**
	 * Total size of the List
	 * @return boolean
	 */
	public int getListSize() {
		return size;
	}

	public void insertAtFirst(int value) {
		Node node = new Node();
		node.setData(value);
		// set current start address
		node.setNext(start);
		start = node;
		size++;
	}

	public void insertAtLast(int value) {
		Node node = null;
		if (isEmpty()) {
			System.out.println("List is Empty.");
		} else {
			// initialize the temporary node to start node
			node = start;
			// print from first element to last element of the List
			for (int i = 0; i < size; i++) {
				// get next node address
				node = node.getNext();
			}
			
		}
	}

	public void insertAtPosition(int value, int position) {

	}

	public void deleteAtFirst() {

	}

	public void deleteAtLast() {

	}

	public void deleteAtPosition(int position) {

	}
}
