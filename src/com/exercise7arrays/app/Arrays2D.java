package com.exercise7arrays.app;

public class Arrays2D {

	public static void main(String[] args) {
		final int ROWS = 10;
		final int COLS = 10;
		int cont=1;
		
		int[][] matrix = new int[ROWS][COLS];
		
		for(int i=0; i<ROWS; i++) {
			for(int j=0; j<COLS; j++) {
				matrix[i][j]=cont;
				cont++;
			}
		}
		
		
		for(int i=0; i<ROWS; i++) {
			for(int j=0; j<COLS; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}

}
