package com.stack.array;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = null;
		int choice = 0, value = 0, size = 0;
		boolean flag = true;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stack Size ::");
		size = sc.nextInt();
		stack = new Stack(size);
		while (flag) {
			System.out.println("1. Size");
			System.out.println("2. Push");
			System.out.println("3. Pop");
			System.out.println("4. Peek");
			System.out.println("5. isFull");
			System.out.println("6. isEmpty");
			System.out.println("7. Display List");
			System.out.println("8. Exit");
			System.out.println("Enter your choice ::");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Size of Stack ::" + stack.getSize());
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
				System.out.println("Peek element is ::" + stack.peek());
				break;
			case 5:
				System.out.println("isFull ::" + stack.isFull());
				break;
			case 6:
				System.out.println("isEmpty ::" + stack.isEmpty());
				break;
			case 7:
				stack.display();
				break;
			case 8:
				flag = false;
				break;
			}
		}
	}

}
