package com.bikash.linkedlist.singly;

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
//			for (int i = 0; i < getListSize() - 1; i++) {
//				System.out.print(node.getData() + "->");
//				// get next node address
//				node = node.getNext();
//			}
			while(node.getNext() != null) {
				System.out.print(node.getData() + "->");
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
//		if (start == null)
//			return true;
//		else
//			return false;
		return start == null;
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
		Node node = new Node(value,start);
//		node.setData(value);
//		// set current start address and it will works for empty and non-empty list
//		node.setNext(start);
		start = node;
		size++;
	}

	public void insertAtLast(int value) { 
		Node node = null;
		if (isEmpty()) {
			System.out.println("List is Empty.");
		} else {
			node = new Node(value,null);
			// initialize the temporary node to start node
			Node tempNode = start;
			// print from first element to last element of the List
//			for (int i = 0; i < size; i++) {
//				// get next node address
//				tempNode = tempNode.getNext();
//			}
			while(tempNode.getNext() != null) {
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
		}
		// if position is last, set value as last element
		else if (position == size) {
			insertAtLast(value);
		} else if (position > 1 && position < size) {
			Node node = new Node(value, null);
			Node temp = start;
			// print from first element to last element of the List
			for (int i = 1; i < position - 1; i++) {
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
			if(size == 1) {
				start = null;
			}else {
				// traverse until (last - 1)th node.
				while (tempNode.getNext() != null && tempNode.getNext().getNext() != null) {
					tempNode = tempNode.getNext();
				}
				tempNode.setNext(null);
			}
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
			Node tempNode = start;
			for (int i = 1; i < position - 1; i++) {
				tempNode = tempNode.getNext();
			}
			// assign next node of specified node
			tempNode.setNext(tempNode.getNext().getNext());
			size--;
		}
	}

	// Sort a linked list
	public void sortList() {
		if (start == null) {
			System.out.println("Empty List...");;
		} else {
			Node head = start;
			Node next = null;
			while (head != null) {
				next = head.getNext();
				while (next != null) {
					if (head.getData() > next.getData()) {
						int temp = head.getData();
						head.setData(next.getData()) ;
						next.setData(temp);
					}
					next = next.getNext();
				}
				head = head.getNext();
			}
			System.out.print("Sorted List ::");
			viewList();
		}

	}

	public void reverseSinglyLinkedList() {
		Node current = start;
		Node next = start;
		Node previous = null;
		if(start == null) {
			System.out.println("List is Empty.");
		}
		while(next != null) {
			next = next.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		start = previous;
		System.out.println("Reversed Linked List ::");
		viewList();
	}
}
