package com.sort;

import java.util.Scanner;

public class BubbleSort {
	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter elements for array::");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		bubbleSort(arr,arr.length);
		// After sorting
		System.out.println("*********************");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

//	private static void bubbleSort(int[] arr, int length) {
//		// for outer loop : each pass
//		for (int i = 0; i < length - 1; i++) {
//			// for each element to be compared
//			if (arr[i] > arr[i + 1]) {
//				int temp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
//			}
//		}
//	}
//	private static void bubbleSort(int[] arr, int length) {
//		// for outer loop : each pass
//		for (int i = 0; i < length - 1; i++) {
//			// for each element to be compared
//			if (arr[i] > arr[i + 1]) {
//				arr[i]= arr[i] ^ arr[i + 1];
//				arr[i+1]= arr[i] ^ arr[i + 1];
//				arr[i]= arr[i] ^ arr[i + 1];
//				i = 0;
////				arr[i]= arr[i]*arr[i + 1];
////				arr[i+1]= arr[i]/arr[i + 1];
////				arr[i]= arr[i]/arr[i + 1];
//			}
//		}
//	}
	private static void bubbleSort(int[] arr, int length) {
		boolean flag = true;
		// for outer loop : each pass
		for (int i = 0; i < length - 1 && flag; i++) {
			flag = false;
			// for each element to be compared
			for (int j = 0; j < length - 1 - i; j++) {
				// compare adjacent elements with each other
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
		}
	}
}
