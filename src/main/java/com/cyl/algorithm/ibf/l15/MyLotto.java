package com.cyl.algorithm.ibf.l15;

import java.util.ArrayList;

public class MyLotto {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 33; i++) {
			list.add(i);
		}

		for (int i = 0; i < 6; i++) {
			int len = list.size();
			int random = (int) (Math.random() * 100) % len;
			System.out.println("第" + (i + 1) + "个红球号码是:" + list.get(random));
			list.remove(random);
		}
	}
}
