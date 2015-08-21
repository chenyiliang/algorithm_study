package com.cyl.algorithm.ibf.l22;

import java.util.LinkedList;
import java.util.Stack;

import com.cyl.algorithm.ibf.l20.BiTreeNode;

public class MyBiTreeInIterator extends MyBiTreeIterator {
	private Stack<BiTreeNode> stack = new Stack<BiTreeNode>();

	public MyBiTreeInIterator() {
		// TODO Auto-generated constructor stub
	}

	public MyBiTreeInIterator(BiTreeNode root) {
		super(root);
	}

	@Override
	public void reset() {
		if (this.root == null) {
			this.isComplete = true;
			return;
		} else {
			this.isComplete = false;
		}
		this.curr = getFarLeft(this.root);
	}

	@Override
	public void next() {
		if (this.isComplete) {
			System.out.println("已经遍历到二叉树结尾！");
			return;
		}
		if (this.curr.getRightChild() != null) {
			this.curr = getFarLeft(this.curr.getRightChild());
		} else if (!stack.empty()) {
			this.curr = stack.pop();
		} else {
			this.isComplete = true;
		}
	}

	public BiTreeNode getFarLeft(BiTreeNode node) {
		if (node == null) {
			return null;
		}
		while (node.getLeftChild() != null) {
			stack.push(node);
			node = node.getLeftChild();
		}
		return node;
	}
}
