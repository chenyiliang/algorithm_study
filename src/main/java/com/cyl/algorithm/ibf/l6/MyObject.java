package com.cyl.algorithm.ibf.l6;

public class MyObject {
	private int hashCode;

	@Override
	public int hashCode() {
		return hashCode;
	}

	public int getHashCode() {
		return hashCode;
	}

	public void setHashCode(int hashCode) {
		this.hashCode = hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

}
