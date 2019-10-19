package com.bikash.linkedlist.circular.doubly;

/**
 * Circular Doubly Linked List.
 * 
 * @author Bikash Kumar
 *
 */
public class CircularLinkedDoublyList {
	private CDNode head, tail;
	private int size = 0;

	/**
	 * insert NODE at 1st position of List tail.getNext() = head address of current
	 * List
	 * 
	 * @param value
	 */
	public void insertAtFirst(int value) {
		CDNode newNode = new CDNode(value);
		if (head == null) {
			head = tail = newNode;
			newNode.setNextNode(head);
			newNode.setPrevNode(head);
		} else {
			// set newNode's next address as head node
			newNode.setNextNode(head);
			// set newNode's previous address as tail node
			newNode.setPrevNode(tail);
			// last node's next address as new node.
			tail.setNextNode(newNode);
			// head's previous address as new node.
			head.setPrevNode(newNode);
			// make tail address as new node address
			head = newNode;
		}
		size++;
	}

	/**
	 * Insert NODE at last position of List
	 * 
	 * @param value
	 */
	public void insertAtLast(int value) {
		CDNode newNode = new CDNode(value);
		if (tail == null) {
			head = tail = newNode;
			newNode.setNextNode(head);
			newNode.setPrevNode(head);
		} else {
			// set newNode's next address as head node
			newNode.setNextNode(head);
			// set newNode's previous address as tail node
			newNode.setPrevNode(tail);
			// last node's next address as new node.
			tail.setNextNode(newNode);
			// head's previous address as new node.
			head.setPrevNode(newNode);
			// make tail address as new node address
			tail = newNode;
		}
		// make tail address as new node address
		size++;
	}

	/**
	 * Print all Node details
	 */
	public void display() {
		if (head == null) {
			System.out.println("Empty List");
		} else {
			CDNode temp = head;
			if (temp != null) {
				while (temp.getNextNode() != head) {
					System.out.print(temp.getData() + "->");
					temp = temp.getNextNode();
				}
				System.out.print(temp.getData());
			} else {
				System.out.println("No Node found....");
			}
		}
	}

	/**
	 * Get Size of List
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Insert Node at specific position
	 * 
	 * @param value
	 * @param position
	 */
	public void insertAtPosition(int value, int position) {
		if (position > getSize() || position < 1) {
			System.out.println("********************");
			System.out.println("Invalid Position");
			System.out.println("********************");
		} else if (position == 1) {
			insertAtFirst(value);
		} else if (position == getSize()) {
			insertAtLast(value);
		} else {
			CDNode node = new CDNode(value);
			CDNode temp = head;
			int i = 1;
			while (i < position - 1) {
				temp = temp.getNextNode();
				i++;
			}
			node.setPrevNode(temp);
			node.setNextNode(temp.getNextNode());
			temp.getNextNode().setPrevNode(node);
			temp.setNextNode(node);
			size++;
		}
	}

	/**
	 * Delete first node
	 */
	public void deleteFirstNode() {
		if (tail == null) {
			System.out.println("Empty List");
		}
		// If only one node is present
		else if (size == 1) {
			head = tail = null;
			size--;
		} else {
			head.getNextNode().setPrevNode(tail);
			tail.setNextNode(head.getNextNode());
			head = head.getNextNode();
			size--;
		}
	}

	/**
	 * Delete last Node from List
	 */
	public void deleteLastNode() {
		if (tail == null) {
			System.out.println("Empty List");
		}
		// If only one node is present
		else if (size == 1) {
			head = tail = null;
			size--;
		} else {
			tail.getPrevNode().setNextNode(head);
			head.setPrevNode(tail.getPrevNode());
			tail.setPrevNode(null);
			tail.setNextNode(null);
			tail = head.getPrevNode();
			size--;
		}
	}

	/**
	 * Delete Node at specified position
	 * 
	 * @param position
	 */
	public void deleteAtPosition(int position) {
		if (position > getSize() || position < 1) {
			System.out.println("********************");
			System.out.println("Invalid Position");
			System.out.println("********************");
		} else if (position == 1) {
			deleteFirstNode();
		} else if (position == getSize()) {
			deleteLastNode();
		} else {
			CDNode temp = head;
			int i = 1;
			while (i < position - 1) {
				temp = temp.getNextNode();
				i++;
			}
			temp.getNextNode().getPrevNode().setPrevNode(temp);
			temp.setNextNode(temp.getNextNode().getNextNode());
			size--;
		}
	}

	/**
	 * Reverse singly circular LL 1. Take 3 pointer to achieve this. i.e
	 * previous,current and next
	 */
//	public void reverseList() {
//		CDNode current = tail.getNextNode();
//		CDNode previous = null;
//		if (tail == null) {
//			System.out.println("Empty List");
//			return;
//		}
//		// if one node is present
//		if (current.getNextNode() == tail) {
//			display();
//			return;
//		}
//		CDNode next = current.getNextNode();
//		// till last node
//		while (current != tail) {
//			previous = current;
//			current = next;
//			next = current.getNextNode();
//			current.setNextNode(previous);
//		}
//		next.setNextNode(tail);
//		tail = next;
//		display();
//	}

}
