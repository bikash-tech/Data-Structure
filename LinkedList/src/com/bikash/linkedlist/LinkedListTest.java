package com.bikash.linkedlist;

import java.util.Scanner;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
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
			System.out.println("9. Exit");
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
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				list.viewList();
				break;
			case 9:
				flag = false;
				break;
			}
		}
	}
}
