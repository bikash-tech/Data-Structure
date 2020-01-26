package com.queue.circuar.array;

public class CircularQueueUsingArray {
	int[] queue = null;
	int front = -1, rear = -1, count, size;

	public CircularQueueUsingArray(int size) {
		super();
		this.queue = new int[size];
		this.count = size;
		this.size = 0;
	}

	/**
	 * push element to the Queue
	 * 
	 * @param element
	 */
	public void enQueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full...");
			return;
		} else if (isEmpty()) {
			rear = front = 0;
		} else if (rear == count - 1 && front != 0) {
			rear = 0;
		} else {
			rear = (rear + 1) % count;
		}
		queue[rear] = element;
		size++;
	}

	/**
	 * pop element from the Queue
	 * 
	 * @param element
	 */
	public void deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty...");
		} else if (front == rear) {
			front = rear = -1;
		} else if (front == count - 1) {
			front = 0;
		} else {
			System.out.println("Popped element is :::" + queue[front]);
			front = (front + 1) % count;
			size--;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Empty Queue...");
		} else {
			System.out.println("Queue elements are :::");
			// front is always the start point of queue and rear is last point. as it is 0
			// based index, so till (rear+1) will go the control.
			int i = front;
			while(i != rear) {
				
			}
			System.out.println();
		}
	}

	/**
	 * Empty check
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	/**
	 * Fullness of Queue
	 * 
	 * @return
	 */
	public boolean isFull() {
		return front == (rear + 1) % count;
	}

	/**
	 * Get the size of Queue
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Peek the element from Queue without removing it.
	 */
	public void peek() {
		if (isEmpty()) {
			System.out.println("Empty Queue, Can't peek an elemet... ");
		} else {
			// Due to LIFO property taking queue[front]
			System.out.println("Peek element is::" + queue[front]);
		}
	}

}
