package com.cyl.algorithm.ibf.l2;

public class SquareMatrixMultiply {
	public static int[][] squareMultiply(int[][] a, int[][] b) {
		if (!isSquareMatrix(a)) {
			throw new IllegalArgumentException(
					"The first matrix is not a square matrix.");
		}
		if (!isSquareMatrix(b)) {
			throw new IllegalArgumentException(
					"The second matrix is not a square matrix.");
		}
		if (a.length != b.length) {
			throw new IllegalArgumentException(
					"The orders of this two square matrix don't equal.");
		}

		int n = a.length;
		int[][] c = new int[n][n];
		
		// i表示a所在的行
		for (int i = 0; i < n; i++) {
			// j表示b所在的列
			for (int j = 0; j < n; j++) {
				// k表示行或列的序数
				for (int k = 0; k < n; k++) {
					c[i][j] += a[i][k] * b[j][k];
				}
			}
		}
		return c;
	}

	public static boolean isSquareMatrix(int[][] a) {
		int row = a.length;
		for (int i = 0; i < row; i++) {
			if (a[i].length != row) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int[][] multiply = squareMultiply(a, b);
		MatrixUtil.printMatrix(a);
		MatrixUtil.printMatrix(b);
		MatrixUtil.printMatrix(multiply);
	}
}
