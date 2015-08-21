package com.cyl.algorithm.ibf.l2;

import java.util.Arrays;

public class BubbleSort {
	/*
	 * 从小到大排序， 比如有长度为3的数组，先把3个数中最大的排到最后一位， 再把前两个数最大的排到倒数第二个，依次类推
	 */
	public static void bubbleSort(int[] a) {
		// i控制数组末尾不用参与比较的个数范围
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	/*
	 * 最差情况 外循环：(n-1) 内循环：平均(n-1+1)(n-1)/2/(n-1) 或直接从内循环结合外循环看 (n-1+1)(n-1)/2
	 */

	// 优化版
	public static void bubbleSortPlus(int[] a) {
		int flag = 1;
		for (int i = 0; i < a.length - 1 && flag == 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				flag = 0;
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 3 };
		bubbleSortPlus(a);
		System.out.println(Arrays.toString(a));
	}
}
