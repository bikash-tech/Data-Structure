package com.stack.linkedlist;

public class LinkedListStack {
	private Node top ;
	private int size =0 ;


	public void push(int value) {
		Node newNode = new Node(value, top);
		top = newNode;
		size++;
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty...");
		} else {
			System.out.println("Poped item is ::" + top.getData());
			top = top.getLink();
			size--;
		}
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			Node temp = top;
			while(temp != null) {
				System.out.print(temp.getData()+"  ");
				temp = temp.getLink();
			}
		}
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return top == null && size == 0;
	}
	public int peek() {
		if(!isEmpty()) {
			return top.getData();
		}else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}
}
