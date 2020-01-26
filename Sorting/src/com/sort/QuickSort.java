package com.sort;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = { 21, 32, 43, 23, 12, 43, 1 }; // for this array sorting is not working
//		int[] array = { 21, 32, 43, 23, 12, 53, 1 };
		QuickSort quickSort = new QuickSort();
		quickSort.sort(array, 0, array.length - 1);

		System.out.println("After sorting.........");
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	private void sort(int[] array, int start, int end) {
		if (start < end) {
			int location = partition(array, start, end);
			sort(array, start, location - 1);
			sort(array, location + 1, end);
		}
	}

	private int partition(int[] array, int start, int end) {
		int lowerBound = start;
		int upperBound = end;
		// make first element of array as pivot element
		int pivotElement = array[start];
		while (lowerBound < upperBound) {
			// when item is less than pivot element increase the lower pointer
			while ((lowerBound <= end) && (array[lowerBound] <= pivotElement) ) {
				lowerBound++;
			}
			// when item is greater than the pivot element decrease the upper pointer
			while ((upperBound >= start) && (array[upperBound] > pivotElement) ) {
				upperBound--;
			}
			// swap when lower index is less than upper index
			if (lowerBound < upperBound) {
				swap(array, lowerBound, upperBound);
			}
		}
		// swap pivot element with upper index value
		swap(array, start, upperBound);
		return upperBound;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
