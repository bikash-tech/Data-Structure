package com.sort;

public class Test {
	static int[] newArr;

	public Test(int length) {
		newArr = new int[length];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 20, 9, 3, 4, 75, 343, 23 };
		new Test(arr.length);
		mergeSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int firstIndex = low;
		int secondIndex = mid + 1;
		int newArrIndex = low;
		while (firstIndex <= mid && secondIndex <= high) {
			if (arr[firstIndex] < arr[secondIndex]) {
				newArr[newArrIndex++] = arr[firstIndex++];
			} else {
				newArr[newArrIndex++] = arr[secondIndex++];
			}
		}
		if (firstIndex > mid) {
			while (secondIndex <= high) {
				newArr[newArrIndex++] = arr[secondIndex++];
			}
		} else {
			while (firstIndex <= mid) {
				newArr[newArrIndex++] = arr[firstIndex++];
			}
		}

		for (newArrIndex = low; newArrIndex <= high; newArrIndex++) {
			arr[newArrIndex] = newArr[newArrIndex];
		}
	}

}
