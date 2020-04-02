package com.stack.array;

public class Stack {
	private int capacity;
	private int top = -1;
	private int[] stack = null;

	public Stack(int size) {
		this.capacity = size;
		stack = new int[capacity];
	}

	public int getSize() {
		return top + 1 ;
	}

	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack Overflow.....");
		}else {
			stack[++top] = value;
		}
	}

	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow ....");
		}else {
			System.out.println("Removed item is ::"+stack[top]);
			stack[top--] = 0;
		}

	}

	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		}else {
			return stack[top];
		}
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("stack is Empty...");		
		}else {
			for(int satckValue : stack) {
				System.out.print(satckValue+" ");
			}
			System.out.println();
		}

	}

}
