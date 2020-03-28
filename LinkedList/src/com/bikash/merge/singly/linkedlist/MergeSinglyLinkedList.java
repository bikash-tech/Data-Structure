package com.bikash.merge.singly.linkedlist;

public class MergeSinglyLinkedList {
	static Node head;

	public static void main(String[] args) {
		int[] data = { 2, 4, 6,8 };
		Node list1 = new Node(null, data[0]);
		for (int i = 1; i <= data.length - 1; i++) {
			insert(list1, data[i]);
		}
		// display node data
		System.out.println("List1 data ::");
		display(list1);
		System.out.println();

		int[] data2 = { 1, 3, 5, 9, 9, 10, 10 };
		Node list2 = new Node(null, data2[0]);
		for (int i = 1; i <= data2.length - 1; i++) {
			insert(list2, data2[i]);
		}
		// display node data
		System.out.println("List2 data ::");
		display(list2);

		// After Merge two list
		System.out.println();
		System.out.println("After Merge two list ::");

		Node mergedList = mergeTwoList(list1, list2);

//		display(null);
		display(mergedList);
	}

	private static Node mergeTwoList(Node list1, Node list2) {
		Node mergedList = null, newNode = null;
		if (list1 == null) {
			return list2;
		}
		else if (list2 == null) {
			return list1;
		}
		// else {
		// // mergedList is resulting pointer which points to the lesser data node.
		// // mergedList points next address in which mergedList is pointing currently.
		// if(list1.getData() < list2.getData()) {
		// // Point to smaller element
		// mergedList = list1;
		// mergedList.setNext(mergeTwoList(list1.getNext(), list2));
		// }else{
		// mergedList = list2;
		// mergedList.setNext(mergeTwoList(list1, list2.getNext()));
		// }
		// }
		if (list1.getData() < list2.getData()) {
			mergedList = list1;
			list1 = list1.getNext();
		} else {
			mergedList = list2;
			list2 = list2.getNext();
		}
		newNode = mergedList;
		while (list1 != null && list2 != null) {
			if (list1.getData() < list2.getData()) {
				newNode.setNext(list1);
				list1 = list1.getNext();
			} else {
				// mergedList.setNext(list2);
				// mergedList = list2;
				// list2 = mergedList.getNext();
				newNode.setNext(list2);
				list2 = list2.getNext();
			}
			newNode = newNode.getNext();
		}
		if (list1 == null) {
			newNode.setNext(list2);
		}
		if (list2 == null) {
			newNode.setNext(list1);
		}

//		 return newNode;
		return mergedList;
	}

	private static void display(Node node) {
		if (node != null) {
			while (node.getNext() != null) {
				System.out.print(node.getData() + "->");
				node = node.getNext();
			}
			System.out.print(node.getData());
		} else {
			System.out.println("No Node found....");
		}
	}

	private static void insert(Node list1, int data) {
		while (list1.getNext() != null) {
			list1 = list1.getNext();
		}
		list1.setNext(new Node(null, data));
	}

}
