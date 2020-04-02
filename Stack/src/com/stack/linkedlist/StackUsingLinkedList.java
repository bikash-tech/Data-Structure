package com.stack.linkedlist;

public class StackUsingLinkedList {
	private Node head;
	private int size;
	
	public int getSize() {
		return size;
	}
	public void push(Object value) {
		Node node = new Node(null, value);
		if(head == null) {
			head = node;
		}else {
			node.setNext(head);
			head = node;
		}	
		size ++;
	}
	public void pop() {
		if(head == null) {
			System.out.println("Stack is Empty....");
		}else {
			System.out.println("Removed Element is ::"+head.getData());
			if(getSize() == 1) {
				head = null;
			}else {
				head = head.getNext();
			}
			size --;
		}
	}
	public Object peek() {
		if(isEmpty()) {
			System.out.println("Empty Stack");
			return "No data Found";
		}else {
			return head.getData();
		}
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Empty Stack");
		}else {
			Node temp = head;
			while(temp.getNext() != null) {
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}
			System.out.println(temp.getData());
		}
	}
}
