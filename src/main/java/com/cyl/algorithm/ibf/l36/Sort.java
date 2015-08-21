package com.cyl.algorithm.ibf.l36;

import java.util.List;

public class Sort {
	public static void sortByEndTime(List<Things> thingsSorted, Integer start,
			Integer end) {
		// 递归结束的条件
		if (start >= end) {
			return;
		}

		// 关键数据
		Things key = thingsSorted.get(start);
		// 最左边的游标
		Integer i = start;
		// 最右边的游标
		Integer j = end;

		while (i < j) {
			// 当后面的值大于等于key时，不交换，继续向前走
			while (j > i
					&& thingsSorted.get(j).getEndTime() >= key.getEndTime()) {
				j--;
				// 跳出这层循环时，若j还>i则找到了可交换元素
			}

			if (j > i) {
				thingsSorted.set(i, thingsSorted.get(j));
				i++;
			}

			while (i < j
					&& thingsSorted.get(i).getEndTime() <= key.getEndTime()) {
				i++;
			}
			if (i < j) {
				thingsSorted.set(j, thingsSorted.get(i));
				j--;
			}
		}

		thingsSorted.set(i, key);

		sortByEndTime(thingsSorted, start, j - 1); // 对前半部分递归
		sortByEndTime(thingsSorted, j + 1, end); // 对后半部分递归
	}
}
