package com.cyl.algorithm.ibf.l4;

public class Test {

	public static void main(String[] args) throws Exception {
		LinkList linkList = new LinkList();
		linkList.insert(0, "a");
		linkList.insert(1, "b");
		linkList.insert(2, "c");
		linkList.delete(2);
		System.out.println(linkList.get(0));
		System.out.println(linkList);
	}

}
