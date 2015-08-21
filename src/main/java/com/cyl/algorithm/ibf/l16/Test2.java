package com.cyl.algorithm.ibf.l16;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		double[][] matrix = { { 0, 2 }, { 2, 3 } };
		SymmeMatrix m = new SymmeMatrix(2);
		m.evaluate(matrix);
		System.out.println(Arrays.toString(m.getRaw()));
		m.print();

		SymmeMatrix m2 = new SymmeMatrix(3);
		m2.evaluate(new double[][] { { 1, 2, 4 }, { 2, 3, 5 }, { 4, 5, 6 } });
		System.out.println(Arrays.toString(m2.getRaw()));
		m2.print();
	}

}
