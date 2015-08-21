package com.cyl.algorithm.ibf.l6;

import java.util.HashSet;

public class MyObjectTest {

	public static void main(String[] args) {
		MyObject myObject1 = new MyObject();
		myObject1.setHashCode(1);
		MyObject myObject2 = new MyObject();
		myObject2.setHashCode(1);
		HashSet<Object> hashSet = new HashSet<>();
		hashSet.add(myObject1);
		hashSet.add(myObject2);

		System.out.println(hashSet);
	}

}
