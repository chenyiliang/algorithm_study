package com.cyl.algorithm.ibf.l20;

public class BiTreeNode {
	private BiTreeNode leftChild;
	private BiTreeNode rightChild;
	private Object data;

	public BiTreeNode() {
	}

	public BiTreeNode(Object data, BiTreeNode leftChild, BiTreeNode rightChild) {
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public BiTreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BiTreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public BiTreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(BiTreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
