package com.queue.linkedlist;

import java.util.Scanner;

public class QueueUsingLinkedListTest {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		int choice = 0;
		while (true) {
			System.out.println("*********************************");
			System.out.println("* 1. Add element to Queue       *");
			System.out.println("* 2. Remove element from Queue  *");
			System.out.println("* 3. Peek from Queue            *");
			System.out.println("* 4. Size of Queue              *");
			System.out.println("* 5. Display Queue elements     *");
			System.out.println("* 6. Exit                       *");
			System.out.println("*********************************");
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
