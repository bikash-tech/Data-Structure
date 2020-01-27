package com.bikash;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 2, 5, 7, 8, 9, 6, 10, 11, 20, 12, 13, 14, 15, 16, 17, 18};
		int missingNumber = findMissingNumber(arr);
		System.out.println("**********\n" + missingNumber);
	}

	/*
	 * There can be overflow if n is large. In order to avoid Integer Overflow, 
	 * we can pick one number from known numbers and subtract one number from given numbers. 
	 * This way we won’t have Integer Overflow ever
	 */
//	private static int findMissingNumber(int[] arr) {
//        int total = 1; 
//        for (int i = 2; i <= (arr.length + 1); i++) 
//        { 
//            total += i; 
//            total -= arr[i - 2]; 
//        } 
//        return total; 
//    }
//	private static int findMissingNumber(int[] arr) {
//		int  n= arr.length+1;
//        int total = (n*(n+1))/2;
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) 
//        { 
//          sum+= arr[i]; 
//        } 
//        return total-sum; 
//    }
	private static int findMissingNumber(int[] arr) {
		int x = 0, y = 0;
		// XOR all elements of an array and assign to x
		for (int i = 0; i < arr.length; i++) {
			x ^= arr[i];
		}
		// XOR all numbers from 1-n and assign to y
		for (int i = 1; i <= arr.length+1; i++) {
			y^= i;
		}
		return x ^ y;
	}
}
