package com.bikash.linkedlist.circular.doubly;

import java.util.Scanner;

public class CircularDoublyLinkedListTest {

	public static void main(String[] args) {
		CircularLinkedDoublyList list = new CircularLinkedDoublyList();
		int choice = 0, value = 0, position;
		boolean flag = true;
		while (flag) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("1. Get List Size");
			System.out.println("2. Add data at first to List");
			System.out.println("3. Add data at last to List");
			System.out.println("4. Add data at specified position to List");
			System.out.println("5. Delete data at first from List");
			System.out.println("6. Delete data at last from List");
			System.out.println("7. Delete data at specified position from List");
			System.out.println("8. Display List");
			System.out.println("9. Reverse List");
			System.out.println("10. Exit");
			System.out.println("Enter your choice ::");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Total SIze of List ::" + list.getSize());
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
				list.deleteFirstNode();
				break;
			case 6:
				list.deleteLastNode();
				break;
			case 7:
				System.out.println("Enter the position");
				position = sc.nextInt();
				list.deleteAtPosition(position);
				break;
			case 8:
				list.display();
				break;
			case 9:
//				list.reverseList();
				break;
			case 10:
				flag = false;
				break;
			}
		}
	}

}
