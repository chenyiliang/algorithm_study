package com.cyl.algorithm.ibf.l23;

public class MyBiTreeNode {
	private Object data;
	private MyBiTreeNode leftNode;
	private MyBiTreeNode rightNode;
	private boolean leftFlag;
	private boolean rightFlag;

	public MyBiTreeNode() {
		this.leftFlag = false;
		this.rightFlag = false;
	}

	public MyBiTreeNode(Object data) {
		this();
		this.setData(data);
	}

	public MyBiTreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(MyBiTreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public MyBiTreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(MyBiTreeNode rightNode) {
		this.rightNode = rightNode;
	}

	public boolean getLeftFlag() {
		return leftFlag;
	}

	public void setLeftFlag(boolean leftFlag) {
		this.leftFlag = leftFlag;
	}

	public boolean getRightFlag() {
		return rightFlag;
	}

	public void setRightFlag(boolean rightFlag) {
		this.rightFlag = rightFlag;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
