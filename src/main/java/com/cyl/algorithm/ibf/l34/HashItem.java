package com.cyl.algorithm.ibf.l34;

public class HashItem {
	private int info;// 表示是否已被占用
	private int data;// 数据域

	public HashItem(int info) {
		this.info = info;
	}

	public HashItem(int info, int data) {
		this.info = info;
		this.data = data;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "HashItem [info=" + info + ", data=" + data + "]";
	}

}
