package com.sort;

public class MergeSort {
	// divide the array into sub arrays
	public void sort(int[] array, int start, int end) {
		// Array should be have more than one elements
		if (start < end) {
			int mid = (start + end) / 2;
			sort(array, start, mid);
			sort(array, mid + 1, end);
			// merge two sub arrays into one more sub array which is also sorted.
			mergeTwoArray(array, start, mid, end);
		}
	}

	private void mergeTwoArray(int[] array, int start, int mid, int end) {
		// visualize 2 sub array and write the code.
		// for first take i, second j and new sorted array as k
		int i = start;
		// 2nd array should start with mid+1 index
		int j = mid + 1;
		// for new sorted array index
		int k = start;
		int[] newArray = new int[array.length];
		// i <= mid (1st sub array condition) and j <= end (2nd sub array condition))
		while (i <= mid && j <= end) {
			// here 1st sub array elements are compared with 2nd sub array elements.
			if (array[i] < array[j]) {
				// always first sub array elements are copied into 2nd
				newArray[k] = array[i];
				// increase 1st sub array index
				i++;
			} else {
				newArray[k] = array[j];
				j++;
			}
			// always increase the new array index because every time one element will add
			// into it
			k++;
		}

		// copy remaining elements from either of sub arrays to new array.
		// 1st sub array index now crossed it's length
		if (i > mid) {
			// remaining elements from 2nd sub array up to it's length copy to new array.
			while (j <= end) {
				newArray[k] = array[j];
				j++;
				k++;
			}
		}
		// 1st sub array index now crossed it's length
		else {
			// remaining elements from 1st sub array up to it's length copy to new array.
			while (i <= mid) {
				newArray[k] = array[i];
				i++;
				k++;
			}
		}

		// copy all elements from new array to old array
		for (k = start; k <= end; k++) {
			array[k] = newArray[k];
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 4, 3, 5, 8, 9, 7, 6, 2 };
		System.out.println("Before sorting..........");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array, 0, array.length - 1);
		// After sort
		System.out.println("After sorting.........");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}