package com.cyl.algorithm.ibf.l29;

import java.util.Arrays;

public class InsertSortDemo {
	public static void insertSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					// 向后移动元素
					for (int k = i; k > j; k--) {
						arr[k] = arr[k - 1];
					}
					arr[j] = temp;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 23, 12, 10, 33, 56, 8, 4, 17, 29, 43 };
		System.out.println(Arrays.toString(arr));
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
