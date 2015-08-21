package com.cyl.algorithm.ibf.l27b;

public class Edge implements Comparable<Edge> {
	// 边类 实现comparable接口方便排序

	private int length;// 边的长度
	private int leftV;// 边的一个顶点的名字
	private int rightV;// 边的另一个定点的名字

	public Edge(int leftV, int length, int rightV) {
		this.leftV = leftV;
		this.length = length;
		this.rightV = rightV;
	}

	public Edge() {

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLeftV() {
		return leftV;
	}

	public void setLeftV(int leftV) {
		this.leftV = leftV;
	}

	public int getRightV() {
		return rightV;
	}

	public void setRightV(int rightV) {
		this.rightV = rightV;
	}

	@Override
	public int compareTo(Edge e) {
		if (e.length > this.length) {
			return -1;
		} else if (e.length == this.length) {
			return 0;
		} else {
			return 1;
		}
	}

	public String toString() {
		return (this.leftV + "<----" + this.length + "---->" + this.rightV);
	}

}
