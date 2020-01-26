package com.queue.circuar.array;

import java.util.Scanner;

public class CircularQueueUsingArrayTest {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the size of Queue::");
		CircularQueueUsingArray queue = new CircularQueueUsingArray(sc.nextInt());
		int choice = 0;
		while (true) {
			System.out.println("1. Add element to Queue");
			System.out.println("2. Remove element from Queue");
			System.out.println("3. Peek from Queue");
			System.out.println("4. Size of Queue");
			System.out.println("5. Display Queue elements");
			System.out.println("6. Exit");
			System.out.println("Enter the choice::");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element ::");
				queue.enQueue(sc.nextInt());
				break;
			case 2:
				queue.deQueue();
				break;
			case 3:
				queue.peek();
				break;
			case 4:
				System.out.println("Size of queue is ::" + queue.getSize());
				break;
			case 5:
				queue.display();
				break;
			case 6:
				System.out.println("Exiting...No futher operation allowed");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice..");
				System.exit(0);
				break;
			}
		}
	}
}
