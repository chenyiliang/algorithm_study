package com.cyl.algorithm.ibf.l33b;

import java.util.ArrayList;
import java.util.List;

public class BTreeNode {
	private List<Integer> keys;
	private List<BTreeNode> children;
	private boolean leaf;

	public BTreeNode() {
		this.keys = new ArrayList<Integer>();
		this.children = new ArrayList<BTreeNode>();
		this.leaf = false;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public int size() {
		return keys.size();
	}

	public SearchResult searchKey(Integer key) {
		int l = 0;
		int h = keys.size() - 1;
		int mid = 0;
		while (l <= h) {
			mid = (1 + h) / 2;
			if (keys.get(mid) == key) {
				break;
			} else if (keys.get(mid) > key) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		boolean result = false;
		int index = 0;
		if (l <= h) {
			result = true;
			index = mid;// index表示元素所在的位置
		} else {
			result = false;
			index = l;// index表示元素应该插入的位置
		}

		return new SearchResult(result, index);
	}

	public void addKey(Integer key) {
		keys.add(key);
	}

	public void removeKey(int index) {
		keys.remove(index);
	}

	public Integer keyAt(int index) {
		return keys.get(index);
	}

	public void insertKey(Integer key) {
		SearchResult result = searchKey(key);
		insertKey(key, result.getIndex());
	}

	public void insertKey(Integer key, int index) {
		ArrayList<Integer> newKeys = new ArrayList<Integer>();
		int i = 0;
		for (; i < index; i++) {
			newKeys.add(keys.get(i));
		}
		newKeys.add(key);
		for (; i < keys.size(); ++i) {
			newKeys.add(keys.get(i));
		}
		keys = newKeys;
	}

	public BTreeNode childAt(int index) {
		if (isLeaf()) {
			throw new UnsupportedOperationException(
					"Leaf node doesn't have children.");
		}
		return children.get(index);
	}

	public void addChild(BTreeNode child) {
		children.add(child);
	}

	public void removeChild(int index) {
		children.remove(index);
	}

	public void insertChild(BTreeNode child, int index) {
		List<BTreeNode> newChildren = new ArrayList<BTreeNode>();
		int i = 0;
		for (; i < index; ++i) {
			newChildren.add(children.get(i));
		}
		newChildren.add(child);
		for (; i < children.size(); ++i) {
			newChildren.add(children.get(i));
		}
		children = newChildren;
	}
}
