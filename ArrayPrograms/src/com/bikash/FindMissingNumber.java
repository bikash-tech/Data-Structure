package com.bikash;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 2, 6, 7, 9, 8 };
		int missingNumber = findMissingNumber(arr);
		System.out.println("**********\n" + missingNumber);
	}

	private static int findMissingNumber(int[] arr) {
		int x = 0, y = 0;
		// XOR all elements of an array and assign to x
		for (int i = 0; i < arr.length; i++) {
			x ^= arr[i];
		}
		// XOR all numbers from 1-n and assign to y
		for (int i = 1; i <= arr.length; i++) {
			y^= i;
		}
		return x ^ y;
	}
}
