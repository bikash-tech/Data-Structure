package com.bikash;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int row1 = 0, column1 = 0;
		int row2 = 0, column2 = 0;
		System.out.println("Enter number of rows for matrix 1::");
		row1 = sc.nextInt();
		System.out.println("Enter number of columns for matrix 1::");
		column1 = sc.nextInt();
		
		System.out.println("Enter number of rows for matrix 2::");
		row2 = sc.nextInt();
		System.out.println("Enter number of columns for matrix 2::");
		column2 = sc.nextInt();
		
		if(column1==row2) {
			int[][] matrix1= new int[row1][column1];
			int[][] matrix2= new int[row2][column2];
			int[][] result= new int[row1][column2];
		
			System.out.println("Enter elements for matrix 1 ::");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column1; j++) {
					matrix1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter elements for matrix 2 ::");
			for (int i = 0; i < row2; i++) {
				for (int j = 0; j < column2; j++) {
					matrix2[i][j] = sc.nextInt();
				}
			}
			System.out.println("\n Result Generating....");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column2; j++) {
					for (int k = 0; k < row2; k++) {
						result[i][j]+=matrix1[i][k]*matrix2[k][j];
						
					}
				}
			}
			System.out.println("\n**** Multiplication Result ****");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column2; j++) {
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
			
		}else {
			System.out.println("Matrix Multiplication not possible for mismatched first matrix column and second matrix row");
		}
		
		
		
	}
}
