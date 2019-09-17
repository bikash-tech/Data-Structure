package com.bikash.linkedlist;

import java.util.Scanner;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int choice = 0;
		boolean flag = true;
		while (flag) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Get List Size");
			System.out.println("2. Add data at first to List");
			System.out.println("3. Add data at last to List");
			System.out.println("4. Add data at specified position to List");
			System.out.println("5. Delete data at first from List");
			System.out.println("6. Delete data at last from List");
			System.out.println("7. Delete data at specified position from List");
			System.out.println("8. Exit");
			System.out.println("Enter your choice ::");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				flag = false;
				break;
			}
		}
	}
}
