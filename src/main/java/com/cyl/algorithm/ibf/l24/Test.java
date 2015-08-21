package com.cyl.algorithm.ibf.l24;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int n = 4;
		int[] weight = { 1, 3, 5, 7 };
		HaffmanTree haffmanTree = new HaffmanTree(n);
		HaffNode[] nodes = new HaffNode[2 * n - 1];
		Code[] codes = new Code[n];
		haffmanTree.haffman(weight, nodes);
		haffmanTree.haffmanCode(nodes, codes);
		for (int i = 0; i < codes.length; i++) {
			System.out.println(codes[i].getWeight()
					+ Arrays.toString(codes[i].getBit()));
		}
	}

}
