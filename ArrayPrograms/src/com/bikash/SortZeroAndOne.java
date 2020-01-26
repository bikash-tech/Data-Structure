package com.bikash;

import java.util.Arrays;

public class SortZeroAndOne {
	public static void main(String[] args) {
		int[] a = {0,1,1,0,0,1,0};
//		Arrays.sort(a);
		for(int i: a) {
			System.out.print(i+" ");
		}
		
		for (int i = 1; i < a.length; i++) {
			int temp= a[i];
			int j= i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		System.out.println("\n********************");
		for(int i: a) {
			System.out.print(i+" ");
		}
	}
}
