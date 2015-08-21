package com.cyl.algorithm.ibf.l16;

import java.util.Random;

public class MyMatrix {
	private int[][] matrix;
	private Random random;

	public MyMatrix() {
		this.matrix = new int[3][3];
		this.random = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(100);
			}
		}
	}

	public MyMatrix(int n) {
		this.matrix = new int[n][n];
		this.random = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(100);
			}
		}
	}

	public MyMatrix(int m, int n) {
		this.matrix = new int[m][n];
		this.random = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(100);
			}
		}
	}

	public int[][] getMatrix() {
		return this.matrix;
	}

	public void print() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public MyMatrix transport() {
		int m = matrix[0].length;
		int n = matrix.length;

		MyMatrix transMatrix = new MyMatrix(m, n);
		for (int i = 0; i < transMatrix.matrix.length; i++) {
			for (int j = 0; j < transMatrix.matrix[i].length; j++) {
				transMatrix.matrix[i][j] = this.matrix[j][i];
			}
		}

		return transMatrix;
	}

	public boolean isUpTriangle() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				if (matrix[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isDownTriangle() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = matrix[i].length - 1; j > i; j--) {
				if (matrix[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isSymmetry() {
		try {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < i; j++) {
					if (matrix[i][j] != matrix[j][i]) {
						return false;
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}

		return true;
	}
}
