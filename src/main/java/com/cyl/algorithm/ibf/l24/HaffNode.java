package com.cyl.algorithm.ibf.l24;

public class HaffNode {
	private int weight;
	private int parent;
	private int flag;
	private int leftChild;
	private int rightChild;

	public HaffNode() {
		// TODO Auto-generated constructor stub
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(int leftChild) {
		this.leftChild = leftChild;
	}

	public int getRightChild() {
		return rightChild;
	}

	public void setRightChild(int rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "HaffNode [weight=" + weight + ", parent=" + parent + ", flag="
				+ flag + ", leftChild=" + leftChild + ", rightChild="
				+ rightChild + "]";
	}

}
