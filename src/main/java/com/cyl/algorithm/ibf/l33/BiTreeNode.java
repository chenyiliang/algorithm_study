package com.cyl.algorithm.ibf.l33;

public class BiTreeNode {
	private BiTreeNode leftChild;
	private BiTreeNode rightChild;
	private BiTreeNode parent;
	private int data;

	public BiTreeNode() {
		// TODO Auto-generated constructor stub
	}

	public BiTreeNode(int data) {
		this.data = data;
	}

	public BiTreeNode(int data, BiTreeNode leftChild, BiTreeNode rightChild) {
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public BiTreeNode getLeft() {
		return leftChild;
	}

	public void setLeft(BiTreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public BiTreeNode getRight() {
		return rightChild;
	}

	public void setRight(BiTreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public BiTreeNode getParent() {
		return parent;
	}

	public void setParent(BiTreeNode parent) {
		this.parent = parent;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
