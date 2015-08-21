package com.cyl.algorithm.ibf.l3;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws Exception {
		SequenceList list = new SequenceList(5);
		list.insert(0, 100);
		list.insert(1, 200);
		list.insert(1, 400);
		System.out.println(Arrays.toString(list.listArray));
	}

}
