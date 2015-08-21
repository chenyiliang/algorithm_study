package com.cyl.algorithm.ibf.l34;

public class MyHashTable {
	// 哈希表数组
	private HashItem[] hashtable;
	// 哈希表的长度
	private int hashTableSize;
	// 当前元素的个数
	private int currentSize;

	public MyHashTable(int len) {
		this.hashtable = new HashItem[len];
		this.hashTableSize = len;
		this.currentSize = 0;
	}

	// 查找算法
	public int find(int x) {
		int i = x % hashTableSize;
		int j = i;

		if (this.hashtable[j] == null) {
			this.hashtable[j] = new HashItem(0);
		}

		// 如果该位置有元素，并且不等于x
		while (this.hashtable[j].getInfo() == 1
				&& this.hashtable[j].getData() != x) {
			j = (j + 1) % hashTableSize;

			// 说明hash表已满
			if (j == i) {
				return -hashTableSize;
			}
		}

		// 说明元素存在
		if (this.hashtable[j].getInfo() == 1) {
			return j;
		} else {
			// 说明找的元素不存
			return -j;
		}
	}

	// 判断元素是否在哈希表中存在
	public boolean isIn(int x) {
		int i = find(x);

		if (i >= 0) {
			return true;
		} else {
			return false;
		}
	}

	// 插入算法
	public boolean insert(int x) {
		int i = find(x);

		if (i >= 0) {
			System.out.println("该元素已存在！");
			return false;
		} else {
			if (i != -hashTableSize) {
				this.hashtable[-i] = new HashItem(1, x);
				this.currentSize++;
				return true;
			} else {
				throw new RuntimeException("哈希表已满，无法插入！");
			}
		}
	}

	// 删除算法
	public boolean delete(int x) {
		int i = find(x);
		if (i >= 0) {
			this.hashtable[i].setInfo(0);
			this.currentSize--;
			return true;
		} else {
			System.out.println("要删除的元素不存在！");
			return false;
		}
	}

	// 获取指定位置的元素值
	public int getValue(int index) {
		return this.hashtable[index].getData();
	}
}
