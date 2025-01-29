package com.demo;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2D array
		// 0 //1 2
		int array1[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		// 0 1 2 0 1 2 0 1 2

		System.out.println(array1[0][1]);
		System.out.println(array1[1][2]);

	 
		
		for (int i = 0; i <= 2; i++) {

			System.out.print("[");
			
			for (int j = 0; j <= 2; j++) {

				System.out.print(array1[i][j]+" , " );

			}
			
			System.out.print("]");
			System.out.println();
		}
		
		
		

	}

}
