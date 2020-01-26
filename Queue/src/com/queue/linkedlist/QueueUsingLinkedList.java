package com.queue.linkedlist;

public class QueueUsingLinkedList {
	private Node front, rear;
	private int  size;

	public QueueUsingLinkedList() {
		super();
		this.front = null;
		this.rear = null;
		this.size = 0;
	}

	/**
	 * push element to the Queue
	 * 
	 * @param element
	 */
	public void enQueue(int element) {
		Node newNode = new Node(element, null);
		if (isEmpty()) {
			rear = front = newNode;
		} else {
			rear.setNext(newNode);
			rear = newNode;
		}
		size++;
	}

	/**
	 * pop element from the Queue
	 * 
	 * @param element
	 */
	public void deQueue() {
		if (isEmpty()) {
			System.out.println("Empty Queue...");
		} else {
			System.out.println("Removed element is ::"+front.getData());
			front = front.getNext();
			size--;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Empty Queue...");
		} else {
			Node temp = front;
			System.out.println("Queue elements are :::");
			// front is always the start point of queue and rear is last point. as it is 0
			// based index, so till (rear+1) will go the control.
			for (int i = 0; i < size - 1; i++) {
				System.out.print(temp.getData() + "  ");
				temp = temp.getNext();
			}
			System.out.println(temp.getData());
		}
	}

	/**
	 * Empty check 
	 * @return
	 */
	public boolean isEmpty() {
		return (size == 0) || (rear == null && front == null);
	}


	/**
	 * Get the size of Queue
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Peek the element from Queue without removing it.
	 */
	public void peek() {
		if(isEmpty()) {
			System.out.println("Empty Queue, Can't peek an elemet... ");
		}else {
			//Due to LIFO property
			System.out.println("Peek element is::"+front.getData());
		}
	}

}
