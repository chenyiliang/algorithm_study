package com.cyl.algorithm.ibf.l16;

public class SymmeMatrix {
	private double[] a;// 矩阵元素
	private int n;// 阶
	private int m;// 一维数组的个数

	public SymmeMatrix(int n) {
		this.n = n;
		this.m = n * (1 + n) / 2;
		this.a = new double[m];
	}

	public void evaluate(double[][] b) {
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				a[k++] = b[i][j];
			}
		}
	}

	public void evaluate(double[] b) {
		for (int i = 0; i < m; i++) {
			a[i] = b[i];
		}
	}

	public double[] getRaw() {
		return this.a;
	}

	public SymmeMatrix add(SymmeMatrix b) {
		SymmeMatrix t = new SymmeMatrix(n);
		for (int i = 0; i < m; i++) {
			t.a[i] = this.a[i] + b.a[i];
		}
		return t;
	}

	public void print() {
		int k;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i >= j) {
					k = i * (i - 1) / 2 + j - 1;
				} else {
					k = j * (j - 1) / 2 + i - 1;
				}
				System.out.print(a[k] + "\t");
			}
			System.out.println();
		}

	}
}
