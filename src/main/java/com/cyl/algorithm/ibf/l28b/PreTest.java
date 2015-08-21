package com.cyl.algorithm.ibf.l28b;

public class PreTest {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int u = 0; u < matrix.length; u++) {
			for (int v = 0; v < matrix.length; v++) {
				for (int w = 0; w < matrix.length; w++) {
					if (matrix[v][w] > matrix[v][u] + matrix[u][w]) {
						matrix[v][w] = matrix[v][u] + matrix[u][w];// 如果存在更短路径则取更短路径
					}
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
