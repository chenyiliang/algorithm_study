package com.cyl.algorithm.ibf.l13;

import java.util.Arrays;

public class KMP2 {
	public static int[] getNext(String sub) {
		int j = 1, k = 0;
		int[] next = new int[sub.length()];
		next[0] = -1;
		next[1] = 0;

		// next[0]和next[1]已确定，故循环次数为sub.length()-2
		// a b c a b c a a a
		// 0 1 2 3 4 5 6 7 8
		// -1//next[0] = -1;
		// 0//next[1] = 0;
		// 0//当j=1,k=0--->j=2,k=0
		// 0//当j=2,k=0--->j=3,k=0
		// 1//当j=3,k=0--->j=4,k=1
		// 2//当j=4,k=1--->j=5,k=2
		// 3//当j=5,k=2--->j=6,k=3
		// 4//当j=6,k=3--->j=7,k=4
		// 当j=7,k=4--->j=7,k=4
		while (j < sub.length() - 1) {
			if (sub.charAt(j) == sub.charAt(k)) {
				System.out.println("True:" + j + ":" + k);
				next[j + 1] = k + 1;
				j++;
				k++;
				// 成功
				System.out.println(Arrays.toString(next));
			} else if (k == 0) {
				System.out.println("Begin:" + j + ":" + k);
				next[j + 1] = 0;
				j++;
				// 一直失败
				System.out.println(Arrays.toString(next));
			} else {
				System.err.println("Fail:" + j + ":" + k);
				k = next[k];
				System.err.println(Arrays.toString(next));
			}

		}

		return next;
	}

	public static void main(String[] args) {
		int[] next = getNext("abcabcaaaab");
	}
}
