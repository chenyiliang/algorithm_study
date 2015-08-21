package com.cyl.algorithm.ibf.l32;

import java.util.Arrays;

public class BinarySearchDemo {
	public static boolean binarySearch(int[] arr, int low, int high, int des) {
		if (low > high) {
			return false;
		}

		int mid = (low + high) / 2;

		if (des == arr[mid]) {
			return true;
		} else if (des < arr[mid]) {
			return binarySearch(arr, low, mid - 1, des);
		} else {
			return binarySearch(arr, mid + 1, high, des);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 45, 12, 32, 7, 5, 11, 22, 65, 18, 73, 95, 18 };
		int des = 13;
		Arrays.sort(arr);

		if (binarySearch(arr, 0, arr.length - 1, des)) {
			System.out.println("查找成功！");
		} else {
			System.out.println("查找失败！");
		}
	}
}
