package com.cyl.algorithm.ibf.l27b;

public class KruskalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table = new int[][] { { 0, 50, 60, 0, 0, 0, 0 },
				{ 50, 0, 0, 65, 40, 0, 0 }, { 60, 0, 0, 52, 0, 0, 45 },
				{ 0, 65, 52, 0, 50, 30, 42 }, { 0, 40, 0, 50, 0, 70, 0 },
				{ 0, 0, 0, 30, 70, 0, 0 }, { 0, 0, 45, 42, 0, 0, 0 } };
		Kruskal k = new Kruskal(table);
		k.kruskal();
		k.showResult();
	}

}
