package com.cyl.algorithm.ibf.l30;

import java.util.Arrays;

public class ShellSort {

	public void sort(int[] array, int from, int end) {
		for (int step = initialStep(end - from + 1); step >= 1; step = (step + 1) / 2 - 1) {
			// 对每轮里的每个分组进行循环
			// 若len为10，这里step为7,3,1
			for (int groupIndex = 0; groupIndex < step; groupIndex++) {
				// 对每组进行直接插入排序
				insertSort(array, groupIndex, step, end);
			}
		}
	}

	public void insertSort(int[] array, int groupIndex, int step, int end) {
		int startIndex = groupIndex;// 从哪里开始排序
		int endIndex = startIndex;// 排到哪里

		while ((endIndex + step) <= end) {
			endIndex += step;
		}

		// i为每小组里的第二个元素开始
		for (int i = groupIndex + step; i <= end; i += step) {
			for (int j = groupIndex; j < i; j += step) {
				int insertedElem = array[i];
				if (array[j] > insertedElem) {
					move(array, j, i - step, step);
					array[j] = insertedElem;
					break;
				}
			}
		}
	}

	public static int initialStep(int len) {
		int step = 1;
		while ((step + 1) * 2 - 1 < len - 1) {
			step = (step + 1) * 2 - 1;
		}
		System.out.println("初始步长 : " + step);
		return step;

	}

	protected final void move(int[] array, int startIndex, int endIndex,
			int step) {
		for (int i = endIndex; i >= startIndex; i -= step) {
			array[i + step] = array[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 23, 12, 10, 33, 56, 8, 4, 17, 29, 43 };
		System.out.println(Arrays.toString(arr));
		new ShellSort().sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
