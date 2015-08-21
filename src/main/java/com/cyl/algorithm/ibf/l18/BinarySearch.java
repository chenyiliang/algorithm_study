package com.cyl.algorithm.ibf.l18;

public class BinarySearch {

	public static boolean bSearch(int[] arr, int des, int low, int high) {
		if (low == high) {
			return des == arr[low];
		}
		int mid = (low + high) / 2;
		if (des == arr[mid]) {
			return true;
		} else if (des < arr[mid]) {
			return bSearch(arr, des, low, mid);
		} else {
			return bSearch(arr, des, mid + 1, high);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 23, 56 };
		System.out.println(bSearch(arr, 56, 0, arr.length - 1));
	}

}
