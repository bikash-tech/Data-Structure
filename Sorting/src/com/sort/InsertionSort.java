package com.sort;

import java.util.Scanner;

/**
 * 1. it is having sorted and unsorted sublist 2. take one value from unsorted
 * sublist and place into sorted sublist 3. need to find the appropriate place
 * for that value in sorted sublist and insert into that place one by one.
 * 
 * a. Loop for all element from 1th index(because of sorted and unsorted
 * concept) b. from unsorted sublist take first element and assign to a
 * temporary variable. c. create j variable with (i-1) d. Take another loop for
 * sorting the elements with condition like j>=0 and a[j] > temporary variable's
 * value d.i if the above condition true, the exchange place between them and
 * decrement the j value by 1 e. assign a[j+1]=temporary variable's value.
 * 
 * @author Bikash Kumar
 *
 */
public class InsertionSort {
	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter Size of Array:");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter elements for array::");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr, arr.length);
		// After sorting
		System.out.println("*********************");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void insertionSort(int[] arr, int length) {
		for (int i = 1; i < length; i++) {
			int temp = arr[i];
			int j = i - 1;
//			while (j >= 0 && arr[j] > temp) {
//				arr[j + 1] = arr[j];
//				j--;
//			}
			for(;j>=0 && arr[j]>temp;j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

}