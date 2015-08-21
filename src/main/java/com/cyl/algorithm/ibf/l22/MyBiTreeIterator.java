package com.cyl.algorithm.ibf.l22;

import com.cyl.algorithm.ibf.l20.BiTreeNode;

public class MyBiTreeIterator {
	protected BiTreeNode root;
	protected BiTreeNode curr;// 当前节点
	protected boolean isComplete;

	public MyBiTreeIterator() {
		// TODO Auto-generated constructor stub
	}

	public MyBiTreeIterator(BiTreeNode root) {
		this.root = root;
	}

	public void reset() {

	}

	public void next() {

	}

	public boolean endOfBiTree() {
		return this.isComplete;
	}

	public Object getData() {
		return this.curr.getData();
	}
}
