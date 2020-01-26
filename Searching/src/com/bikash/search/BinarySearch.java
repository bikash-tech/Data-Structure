package com.bikash.search;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		 int[] arr = { 12, 45, 78, 98, 65, 45, 11, 3, 5, 6, 7 };
//		int[] arr = { 5, 8, 48, 1, 3, 49, 99, 78, 67, 76, 23, 19, 58 };
		 Arrays.sort(arr);
		 int position =  Arrays.binarySearch(arr, 98);
//		int position = find(arr, 98);
//		int position = find(arr, 98);
		if (position == -1)
			throw new ArrayIndexOutOfBoundsException("Position Not Found...");
		System.out.println("position of " + arr[position] + " is :" + position);
	}

	private static int find(int[] arr, int data) {
		System.out.println("find function....");
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (end + start) / 2;
			if (arr[mid] == data)
				return mid;
			else if (arr[mid] > data)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
}
