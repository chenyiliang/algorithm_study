package com.cyl.algorithm.ibf.l37;

import java.util.Arrays;
import java.util.List;

public class Combination {
	public static void main(String[] args) {
		// 从5个元素中选出3个元素的组合，这里3层循环写死
		// int m = 5;
		// int n = 3;
		// for (int i = 0; i < m; i++) {
		// for (int j = i + 1; j < m; j++) {
		// for (int k = j + 1; k < m; k++) {
		// System.out.println((i + 1) + ":" + (j + 1) + ":" + (k + 1));
		// }
		// }
		// }

		nestedCycle(2, 2, new int[2]);
	}

	public static void cycleRecrusively(int m, int n, int begin,
			List<Integer> list) {
		if (n > 0) {
			for (int i = begin; i < m; i++) {
				list.add(i);
				cycleRecrusively(m, n - 1, i + 1, list);
			}
		} else {
			System.out.println(list);
			list.clear();
		}
	}

	public static void nestedCycle(int total, int cur, int[] arr) {
		if (arr == null || arr.length != total) {
			throw new IllegalArgumentException("arr数组的长度必须和total一致");
		}
		if (cur > 0) {
			for (int i = 0; i < total; i++) {
				// System.out.println("---:" + list.size() + ":" + (total -
				// cur));
				// list.set(total - cur, i);
				arr[total - cur] = i;
				if (cur == 1) {
					System.out.println(Arrays.toString(arr));
				}
				nestedCycle(total, cur - 1, arr);
			}
		}
	}
}
