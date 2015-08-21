package com.cyl.algorithm.ibf.l18;

public class JieChengDemo {

	private static int jiesheng(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * jiesheng(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(jiesheng(4));
	}

}
