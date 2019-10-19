package com.turing;

import java.util.Scanner;

class Solution {
	public int numOffices(String[][] grids) {
		int result = 0;
		// Put your code here.
		for (String[] grid : grids) {
			int count = 0;
			for (int i = 1; i < grid.length; i = i + 2) {
				if (i >= grid.length) {
					break;
				}
				if ((Integer.parseInt(grid[i]) - Integer.parseInt(grid[i - 1]) == 0)
						&& Integer.parseInt(grid[i]) == 1) {
					++count;
				}
			}
			result += count;
		}
		return result;
	}
}

class Rextester {
	private static Scanner sc;

	public static String[][] getMatrix() {
		sc = new Scanner(System.in);
		int rowsLen = sc.nextInt();
		int colsLen = sc.nextInt();
		String matrix[][] = new String[rowsLen][colsLen];
		int i;
		for (i = 0; i < rowsLen; i++) {
			String line = sc.next();
			for (int j = 0; j < line.length(); j++) {
				matrix[i][j] = String.valueOf(line.charAt(j));
			}
		}
		return matrix;
	}

	public static void main(String args[]) {
		int result = new Solution().numOffices(getMatrix());
		System.out.println(result);
	}
}