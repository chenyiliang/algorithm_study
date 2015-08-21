package com.cyl.algorithm.ibf.l31;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
	@SuppressWarnings("unchecked")
	public static void radixSort(int[] a, int m, int d) {
		// a为要排序的数据元素，d为进制的基数，m为数据元素的最大位数
		int n = a.length;
		int i, j, k, l, power = 1;
		Queue<Integer>[] myQueue = new LinkedList[d];

		// 创建链式队列数组对象
		for (i = 0; i < d; i++) {
			Queue<Integer> temp = new LinkedList<Integer>();
			myQueue[i] = temp;
		}

		// 进行m次排序
		for (i = 0; i < m; i++) {
			if (i == 0) {
				power = 1;
			} else {
				power = power * d;
			}

			// 依次将n个数据元素按第k位的大小放到相应的队列中
			for (j = 0; j < n; j++) {
				k = a[j] / power - (a[j] / (power * d)) * d; // 计算k值
				myQueue[k].add(new Integer(a[j])); // a[j]入队列k
			}

			// 顺序回收各队列中的数据元素到数组a中
			l = 0;
			for (j = 0; j < d; j++) {
				while (!myQueue[j].isEmpty()) {
					a[l] = ((Integer) myQueue[j].remove()).intValue();
					l++;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] test = { 710, 342, 45, 686, 6, 841, 429, 134, 68, 264 };
		int m = 3, d = 10;
		System.out.println(Arrays.toString(test));
		radixSort(test, m, d);
		System.out.println(Arrays.toString(test));
	}
}
