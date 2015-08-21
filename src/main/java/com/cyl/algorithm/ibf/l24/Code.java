package com.cyl.algorithm.ibf.l24;

public class Code {
	private int[] bit;
	private int start;
	private int weight;

	public Code(int n) {
		this.bit = new int[n];
		this.start = n - 1;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int[] getBit() {
		return bit;
	}

	public void setBit(int[] bit) {
		this.bit = bit;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

}
