package com.queue.array;

public class QueueUsingArray {
	int[] queue = null;
	int front = -1, rear = -1, count, size;

	public QueueUsingArray(int size) {
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
			queue[rear] = element;
		} else {
			rear++;
			queue[rear] = element;
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
			System.out.println("Queue is Empty...");
		} else {
			System.out.println("Popped element is :::" + queue[front]);
			front++;
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
			for (int i = front; i < rear + 1; i++) {
				System.out.print(queue[i] + "  ");
			}
			System.out.println();
		}
	}

	/**
	 * Empty check 
	 * @return
	 */
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	/** 
	 * Fullness of Queue
	 * @return
	 */
	public boolean isFull() {
		return rear == count - 1;
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
			//Due to LIFO property taking queue[front]
			System.out.println("Peek element is::"+queue[front]);
		}
	}

}
