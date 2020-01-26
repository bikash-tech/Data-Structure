package com.sort;

import java.util.Scanner;

/**
 * 1. Find the minimum/maximum element from array
 * 2. maintain one sorted and unsorted sub-array for reference 
 * 3. swap between the numbers
 * 
 * @author Bikash Kumar
 *
 */
public class SelectionSort {
	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter elements for array::");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		selectionSort(arr, arr.length);
		// After sorting
		System.out.println("*********************");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void selectionSort(int[] arr, int length) {
		for (int i = 0; i < length - 1; i++) {
			int min = i;
			for (int j = i+1; j < length; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(min != i) { // for avoiding unnecessary swapping if both the elements are same
				System.out.println("Hurrayyyyy!!!!!!!!!!!!!!");
				arr[i] = arr[i]*arr[min];
				arr[min] = arr[i]/arr[min];
				arr[i] = arr[i]/arr[min];
			}
		}
	}

}