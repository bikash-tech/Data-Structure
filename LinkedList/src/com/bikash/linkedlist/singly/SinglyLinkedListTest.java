package com.bikash.linkedlist.singly;

import java.util.Scanner;

public class SinglyLinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int choice = 0, value = 0, position;
		boolean flag = true;
		while (flag) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("01. Get List Size");
			System.out.println("02. Add data at first to List");
			System.out.println("03. Add data at last to List");
			System.out.println("04. Add data at specified position to List");
			System.out.println("05. Delete data at first from List");
			System.out.println("06. Delete data at last from List");
			System.out.println("07. Delete data at specified position from List");
			System.out.println("08. Display List");
			System.out.println("09. Sort List");
			System.out.println("10. Reverse Linked List");
			System.out.println("11. Exit");
			System.out.println("Enter your choice ::");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Total SIze of List ::"+list.getListSize());
				break;
			case 2:
				System.out.println("Enter data :");
				value = sc.nextInt();
				list.insertAtFirst(value);
				break;
			case 3:
				System.out.println("Enter data :");
				value = sc.nextInt();
				list.insertAtLast(value);
				break;
			case 4:
				System.out.println("Enter the position");
				position = sc.nextInt();
				System.out.println("Enter data :");
				value = sc.nextInt();
				list.insertAtPosition(value, position);
				break;
			case 5:
				list.deleteAtFirst();;
				break;
			case 6:
				list.deleteAtLast();;
				break;
			case 7:
				System.out.println("Enter the position");
				position = sc.nextInt();
				list.deleteAtPosition(position);
				break;
			case 8:
				list.viewList();
				break;
			case 9:
				list.sortList();
				break;
			case 10:
				list.reverseSinglyLinkedList();
				break;
			case 11:
				flag = false;
				break;
			}
		}
	}
}
