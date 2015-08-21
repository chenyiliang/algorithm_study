package com.cyl.algorithm.ibf.l22;

import java.util.Stack;

import com.cyl.algorithm.ibf.l20.BiTreeNode;

public class MyBiTreePostIterator extends MyBiTreeIterator {
	private Stack<BiTreeNode> stack = new Stack<BiTreeNode>();
	private Stack<BiTreeNode> temp = new Stack<BiTreeNode>();

	public MyBiTreePostIterator() {
		// TODO Auto-generated constructor stub
	}

	public MyBiTreePostIterator(BiTreeNode root) {
		super(root);
	}

}
