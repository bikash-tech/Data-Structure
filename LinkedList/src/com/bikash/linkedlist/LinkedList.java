package com.bikash.linkedlist;

/**
 * Custom LinkedList with all possible operations
 * 
 * @author Bikash Kumar
 * @version 1.0
 * 
 *          https://www.youtube.com/watch?v=R_11EM5OdDI&list=PL7ersPsTyYt2gskM6IKhsHaI5EtJlkNog&index=6
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
	 * Display all Node's data Take one pointer node to traverse the whole List
	 */
	public void viewList() {
		Node node = null;
		if (isEmpty()) {
			System.out.println("List is Empty.");
		} else {
			// initialize the temporary node to start node
			node = start;
			// print from first element to last element of the List
			for (int i = 0; i < size - 1; i++) {
				System.out.print(node.getData() + "->");
				// get next node address
				node = node.getNext();
			}
			System.out.print(node.getData());
		}
	}

	/**
	 * If start node is null, then return true
	 * 
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
	 * 
	 * @return boolean
	 */
	public int getListSize() {
		return size;
	}

	public void insertAtFirst(int value) {
		Node node = new Node();
		node.setData(value);
		// set current start address and it will works for empty and non-empty list
		node.setNext(start);
		start = node;
		size++;
	}

	public void insertAtLast(int value) {
		Node node = null;
		if (isEmpty()) {
			System.out.println("List is Empty.");
		} else {
			node = new Node();
			node.setData(value);
			node.setNext(null);
			// initialize the temporary node to start node
			Node tempNode = start;
			// print from first element to last element of the List
			for (int i = 0; i < size; i++) {
				// get next node address
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(node);
			size++;
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
		} else {
			System.out.println("Invalid Position ... try again");
		}
	}

	/**
	 * Delete first node
	 */
	public void deleteAtFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty...");
		} else {
			start = start.getNext();
			size--;
		}
	}

	/**
	 * Delete last node
	 */
	public void deleteAtLast() {
		if (isEmpty()) {
			System.out.println("List is Empty...");
		} else {
			Node tempNode = start;
			// traverse until (last - 1)th node.
			while (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			size--;
		}
	}

	/**
	 * Delete node at specified position
	 * 
	 * @param position
	 */
	public void deleteAtPosition(int position) {
		if (isEmpty()) {
			System.out.println("List is Empty..");
		} else if (position > size || position < 1) {
			System.out.println("Invalid position");
		} else if (position == 1) {
			deleteAtFirst();
		} else if (position == size) {
			deleteAtLast();
		} else {
			Node tempNode1, tempNode2;
			tempNode1 = start;
			for (int i = 0; i < position - 1; i++) {
				tempNode1 = tempNode1.getNext();
			}
			// assign next node of specified node
//			tempNode2 = tempNode1.getNext();
//			tempNode1.setNext(tempNode2);
			tempNode1.setNext(tempNode1.getNext());
			size--;
		}
	}
}
