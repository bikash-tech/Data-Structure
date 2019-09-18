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
			for (int i = 0; i < size-1; i++) {
				System.out.print(node.getData()+"->");
				// get next node address
				node = node.getNext();
			}
			System.out.print(node.getData());
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
	/**
	 * Insert the given value at given position
	 * 
	 * @param value
	 * @param position
	 */
	public void insertAtPosition(int value, int position) {
		// if position = 1, insert the value as first element
		if (position == 1) {
			insertAtFirst(value);
			size++;
		}
		// if position is last, set value as last element
		else if (position == size + 1) {
			insertAtLast(value);
			size++;
		} else if (position > 1 && position <= size) {
			Node node = new Node(value, null);
			Node temp = start;
			// print from first element to last element of the List
			for (int i = 0; i < position - 1; i++) {
				// get next node address
				temp = temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
			size++;
		}else {
			System.out.println("Invalid Position ... try again");
		}
	}

	public void deleteAtFirst() {

	}

	public void deleteAtLast() {

	}

	public void deleteAtPosition(int position) {

	}
}
