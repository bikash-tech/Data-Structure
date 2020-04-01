package com.bikash.linkedlist.circular.singly;

/**
 * Circular Singly Linked List. Maintain one tail pointer for holding head and
 * tail address and size for holding length
 * 
 * @author Bikash Kumar
 *
 */
public class CircularLinkedSinlglyList {
	CDNode tail;
	int size = 0;

	/**
	 * insert NODE at 1st position of List tail.getNext() = head address of current
	 * List
	 * 
	 * @param value
	 */
	public void insertAtFirst(int value) {
		CDNode node = new CDNode(value);
		if (tail == null) {
			tail = node;
			tail.setNextNode(node);
		} else {
			// set new node address = previous head node
			node.setNextNode(tail.getNextNode());
		}
		// make tail address as new node address
		tail.setNextNode(node);
		size++;
	}

	/**
	 * Insert NODE at last position of List
	 * 
	 * @param value
	 */
	public void insertAtLast(int value) {
		CDNode node = new CDNode(value);
		if (tail == null) {
			tail = node;
			tail.setNextNode(node);
		} else {
			// set new node address = previous head node
			node.setNextNode(tail.getNextNode());
			// set last node next address as new node address
			tail.setNextNode(node);
			// change the tail pointer to new node address
			tail = node;
		}
		// make tail address as new node address
		size++;
	}

	/**
	 * Print all Node details
	 */
	public void display() {
		if (tail == null) {
			System.out.println("Empty List");
		} else {
			CDNode temp = tail.getNextNode();
			if (temp != null) {
				CDNode node = temp;
				while (node.getNextNode() != temp) {
					System.out.print(node.getData() + "->");
					node = node.getNextNode();
				}
				System.out.print(node.getData());
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
			CDNode temp = tail.getNextNode();
			int i = 1;
			while (i < position - 1) {
				temp = temp.getNextNode();
				i++;
			}
			node.setNextNode(temp.getNextNode());
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
		} else {
			if(getSize() == 1) {
				tail = null;
			}else {
				CDNode head = tail.getNextNode();
				tail.setNextNode(head.getNextNode());
				head.setNextNode(null);
			}
			size--;
		}
	}

	/**
	 * Delete last Node from List
	 */
	public void deleteLastNode() {
		if (tail == null) {
			System.out.println("Empty List");
		} else {
			CDNode head = tail.getNextNode();
			CDNode temp = head;
			while (temp.getNextNode() != tail) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(head);
			tail = temp;
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
			CDNode head = tail.getNextNode();
			CDNode temp = head;
			int i = 1;
			while (i < position - 1) {
				temp = temp.getNextNode();
				i++;
			}
			temp.setNextNode(temp.getNextNode().getNextNode());
			size--;
		}
	}

	/**
	 * Reverse singly circular LL 1. Take 3 pointer to achieve this. i.e
	 * previous,current and next
	 */
	public void reverseList() {
		CDNode current = tail.getNextNode();
		CDNode previous = null;
		if (tail == null) {
			System.out.println("Empty List");
			return;
		}
		// if one node is present
		if (current.getNextNode() == tail) {
			display();
			return;
		}
		CDNode next = current.getNextNode();
		// till last node
		while (current != tail) {
			previous = current;
			current = next;
			next = current.getNextNode();
			current.setNextNode(previous);
		}
		next.setNextNode(tail);
		tail = next;
		display();
	}

}
