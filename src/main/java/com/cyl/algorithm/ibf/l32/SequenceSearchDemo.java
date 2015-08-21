package com.cyl.algorithm.ibf.l32;

public class SequenceSearchDemo {

	public static int sequenceSearch(int[] arr, int des) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == des) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 23, 45, 8, 0, 12, 33, 19, 27, 35, 62, 4 };
		int des = 34;
		int index = -1;

		if ((index = SequenceSearchDemo.sequenceSearch(arr, des)) != -1) {
			System.out.println("查找成功！元素：" + des + "的位置是：" + index);
		} else {
			System.out.println("查找失败！");
		}
	}

}
