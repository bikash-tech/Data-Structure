package com.sort;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 23, 56, 56, 81, 4, 84, 45, 456, 43, 15, 86, 49 };
		quickSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void quickSort(int[] arr, int i, int j) {
		if (i < j) {
			int pivot = partionArray(arr, i, j);
			quickSort(arr, i, pivot - 1);
			quickSort(arr, pivot + 1, j);
		}

	}

	private static int partionArray(int[] arr, int i, int j) {
		int low = i, high = j, pivot = arr[i];
		while (low < high) {
			while (low <= j && arr[low] <= pivot)
				low++;
			while (high >= i && arr[high] > pivot)
				high--;
			if (low < high)
				swap(arr, low, high);
		}
		swap(arr, i, high);
		return high;
	}

	private static void swap(int[] arr, int low, int high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}

}
