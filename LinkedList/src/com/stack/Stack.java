package com.stack;

public class Stack {
	private int[] stack = null;
	private int top = -1, capacity = 0;

	Stack(int size){
		stack = new int[size];
		capacity = size;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is full...");
		} else {
			stack[++top] = value;
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is empty...");
		} else {
			int data = stack[top];
			top--;
			System.out.println("Poped item is ::" + data);
		}
	}
	public void display() {
		if(top == -1) {
			System.out.println("Stack is Empty");
		}else {
			for(int i = top; i >= 0 ; i--) {
				System.out.println(stack[i]);
			}
		}
	}
	public int getSize() {
		return top + 1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == capacity - 1;
	}

	public int peek() {
		if(!isEmpty()) {
			return stack[top];
		}else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}
}
