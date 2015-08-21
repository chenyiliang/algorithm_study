package com.cyl.algorithm.ibf.l29;

import java.util.Arrays;

public class SwapSortDemo {

	public static void swapSort(int[] arr) {
		for (int i = arr.length; i > 1; i--) {
			// i max length min 2
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 23, 12, 10, 33, 56, 8, 4, 17, 29, 43 };
		System.out.println(Arrays.toString(arr));
		swapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
