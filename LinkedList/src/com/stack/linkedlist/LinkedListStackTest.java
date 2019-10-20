package com.stack.linkedlist;

import java.util.Scanner;

public class LinkedListStackTest {

	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();
		int choice = 0, value = 0;
		boolean flag = true;
		while (flag) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("1. Size");
			System.out.println("2. Push");
			System.out.println("3. Pop");
			System.out.println("4. Peek");
			System.out.println("5. isEmpty");
			System.out.println("6. Display List");
			System.out.println("7. Exit");
			System.out.println("Enter your choice ::");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Size of Stack ::"+stack.getSize());
				break;
			case 2:
				System.out.println("Enter data :");
				value = sc.nextInt();
				stack.push(value);
				break;
			case 3:
				stack.pop();
				break;
			case 4:
				System.out.println("Peek element is ::"+stack.peek());
				break;
			case 5:
				System.out.println("isEmpty ::"+stack.isEmpty());
				break;
			case 6:
				stack.display();
				break;
			case 7:
				flag = false;
				break;
			}
		}
	}

}
