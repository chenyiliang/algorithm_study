package com.cyl.algorithm.ibf.l2;

public final class MatrixUtil {
	private MatrixUtil() {
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			printMatrixRow(matrix[i]);
		}
	}

	private static void printMatrixRow(int[] row) {
		for (int i = 0; i < row.length - 1; i++) {
			System.out.print(row[i] + "\t");
		}
		System.out.println(row[row.length - 1]);
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 } };
		printMatrix(a);
	}
}
