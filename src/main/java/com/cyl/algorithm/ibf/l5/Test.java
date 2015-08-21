package com.cyl.algorithm.ibf.l5;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) throws Exception {
		CycleLinkList linkList = new CycleLinkList();
		linkList.insert(0, "a");
		linkList.insert(1, "b");
		linkList.insert(2, "c");
		linkList.delete(2);
		System.out.println(linkList.get(0));
		System.out.println(linkList);
		
		LinkedList<String> list = new LinkedList<String>();
	}

}
