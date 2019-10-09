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
		head = null;
		tail = null;
		size = 0;
	}

	/**
	 * Get Size of the List
	 * 
	 * @return {@link Integer}
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Check for empty-ness
	 * 
	 * @return {@link Boolean}
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Insert at first position
	 * 
	 * @param data
	 */
	public void insertAtFirst(int data) {
		DNode node = null;
		node = new DNode(data);
		// If head node is empty
		if (head == null) {
			head = node;
			tail = head;
		}
		// If head node is not empty
		else {
			head.setPrevNode(node);
			node.setNextNode(head);
			// assign the latest node as head
			head = node;
		}
		size++;
	}

	/**
	 * Insert at last last
	 * 
	 * @param data
	 */
	public void insertAtLast(int data) {
		DNode node = new DNode(data);
		// If head node is empty
		if (head == null) {
			head = node;
			tail = head;
		}
		// If head node is not empty
		else {
			tail.setNextNode(node);
			node.setPrevNode(tail);
			tail = node;
		}
		size++;
	}

	/**
	 * Insert at specified position
	 * 
	 * @param data
	 * @param position
	 */
	public void insertAtPosition(int data, int position) {
		if (position < 1 || position > size) {
			System.out.println("Invalid postion entered...");
		} else if (position == 1 && position != size) {
			insertAtFirst(data);
		} else if (position == size) {
			insertAtLast(data);
		} else {
			DNode tempNode = head;
			for (int i = 0; i < position - 1; i++) {
				tempNode = tempNode.getNextNode();
			}
			DNode node = new DNode(data);
			node.setNextNode(tempNode);
			node.setPrevNode(tempNode.getPrevNode());
			node.getPrevNode().setNextNode(node);
			tempNode.setPrevNode(node);
			size++;
		}
	}

	/**
	 * Delete first Node from List
	 */
	public void deleteFirstNode() {
		if (isEmpty()) {
			System.out.println("List is Empty");
		} else {
			head = head.getNextNode();
			head.setPrevNode(null);
			size--;
		}
	}

	/**
	 * Delete last Node from List
	 */
	public void deleteLastNode() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else {
			tail = tail.getPrevNode();
			tail.setNextNode(null);
			size--;
		}
	}

	public void deleteAtPosition(int position) {
		if (head == null && tail == null) {
			System.out.println("No Node available");
			return;
		} else if (position < 1 || position > getSize()) {
			System.out.println(" Invalid position ");
		} else if (position == 1) {
			deleteFirstNode();
		} else if (position == getSize()) {
			deleteLastNode();
		} else {
			DNode tempNode = head;
			int i = 1;
			while (i < position) {
				tempNode = tempNode.getNextNode();
				i++;
			}
			tempNode.getPrevNode().setNextNode(tempNode.getNextNode());
			tempNode.getNextNode().setPrevNode(tempNode.getPrevNode());
			size--;
		}
	}

	/**
	 * Display all node data's
	 */
	public void display() {
		DNode node = head;
		if (isEmpty()) {
			System.out.println("Empty List");
			return;
		}
		for (int i = 0; i < getSize() - 1; i++) {
			System.out.print(node.getData() + "<->");
			node = node.getNextNode();
		}
		System.out.print(node.getData());

	}

//	public static void main(String[] args) {
//		DoublyLinkedList dll = new DoublyLinkedList();
//		dll.insertAtFirst(10);
//		dll.insertAtFirst(5);
//		dll.insertAtFirst(15);
//		dll.insertAtFirst(01);
//		dll.display();
//		System.out.println("\nSize :" + dll.getSize());
//		System.out.println("*****************************");
//		dll.insertAtLast(34);
//		dll.insertAtLast(45);
//		dll.display();
//		System.out.println("\nSize :" + dll.getSize());
//		System.out.println("*****************************");
//		dll.insertAtPosition(23, 1);
//		dll.insertAtPosition(24, 4);
//		dll.display();
//		System.out.println("\nSize :" + dll.getSize());
//		System.out.println("*****************************");
//		// dll.deleteFirstNode();
//		// dll.deleteLastNode();
//		// dll.deleteAtPosition(2);
//		dll.insertAtPosition(222, 7);
//		dll.display();
//		System.out.println("\nSize :" + dll.getSize());
//		System.out.println("*****************************");
//	}

}
