package com.cyl.algorithm.ibf.l22;

import java.util.Stack;

import com.cyl.algorithm.ibf.l20.BiTreeNode;

public class MyBiTreePreIterator extends MyBiTreeIterator {
	private Stack<BiTreeNode> stack = new Stack<BiTreeNode>();

	public MyBiTreePreIterator() {
		// TODO Auto-generated constructor stub
	}

	public MyBiTreePreIterator(BiTreeNode root) {
		super(root);
	}

	@Override
	public void next() {
		if (this.isComplete) {
			System.out.println("已经遍历到二叉树结尾！");
			return;
		}
		if (this.curr.getRightChild() != null) {
			stack.push(this.curr.getRightChild());
		}
		if (this.curr.getLeftChild() != null) {
			stack.push(this.curr.getLeftChild());
		}
		if (!stack.empty()) {
			this.curr = stack.pop();
		} else {
			this.isComplete = true;
		}
	}

	@Override
	public void reset() {
		if (this.root == null) {
			this.isComplete = true;
			return;
		} else {
			this.isComplete = false;
		}
		this.curr = this.root;
	}
}
