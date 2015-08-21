package com.cyl.algorithm.ibf.l23;

import java.util.Scanner;

public class MyThreadBiTree {
	protected MyBiTreeNode head;
	protected final static String ENDFLAG = "null";

	public MyThreadBiTree() {
		// TODO Auto-generated constructor stub
	}

	public void initMyBiTree() {
		String item;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入二叉树的树根节点(输入null表示该节点为空):");
		item = in.next();
		if (!item.equalsIgnoreCase(ENDFLAG)) {
			in.close();
			head = new MyBiTreeNode(item);
			init(head);
		} else {
			in.close();
		}
	}

	//
	private void init(MyBiTreeNode head) {
		String item;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入" + head.getData() + "节点的左孩子节点:");
		item = in.next();
		if (!item.equalsIgnoreCase(ENDFLAG)) {
			head.setLeftNode(new MyBiTreeNode(item));
			init(head.getLeftNode());
		}
		System.out.println("请输入" + head.getData() + "节点的右孩子节点:");
		item = in.next();
		if (!item.equalsIgnoreCase(ENDFLAG)) {
			head.setRightNode(new MyBiTreeNode(item));
			init(head.getRightNode());
		}
		in.close();
	}

	public void createMyThreadBiTree() {

	}

	public void traversal() {

	}
}
