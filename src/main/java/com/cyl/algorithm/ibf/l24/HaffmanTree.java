package com.cyl.algorithm.ibf.l24;

public class HaffmanTree {
	// 最大权值
	private static final int MAXVALUE = 1000;
	// 叶子结点个数
	private int nodeNum;

	public HaffmanTree(int n) {
		this.nodeNum = n;
	}

	public void haffman(int[] weight, HaffNode[] nodes) {
		int n = this.nodeNum;
		// m1,m2,表示最小的两个权值，x1,x2,表示最小两个权值对应的编号
		int m1, m2, x1, x2;

		// 初始化所有的节点，对应有n个叶子节点哈弗曼树，有2n-1个节点
		for (int i = 0; i < 2 * n - 1; i++) {
			HaffNode temp = new HaffNode();
			// 初始化n个叶子节点
			if (i < n) {
				temp.setWeight(weight[i]);
			} else {
				temp.setWeight(0);
			}
			temp.setParent(0);
			temp.setFlag(0);
			temp.setLeftChild(-1);
			temp.setRightChild(-1);
			nodes[i] = temp;
		}

		// 初始化n-1非叶子节点
		for (int i = 0; i < n - 1; i++) {
			m1 = m2 = MAXVALUE;
			x1 = x2 = 0;
			for (int j = 0; j < n + i; j++) {
				if (nodes[j].getWeight() < m1 && nodes[j].getFlag() == 0) {
					m2 = m1;
					x2 = x1;
					m1 = nodes[j].getWeight();
					x1 = j;
				} else if (nodes[j].getWeight() < m2 && nodes[j].getFlag() == 0) {
					m2 = nodes[j].getWeight();
					x2 = j;
				}
			}
			nodes[x1].setParent(n + i);
			nodes[x2].setParent(n + i);
			nodes[x1].setFlag(1);
			nodes[x2].setFlag(1);
			nodes[n + i].setWeight(nodes[x1].getWeight()
					+ nodes[x2].getWeight());
			nodes[n + i].setLeftChild(x1);
			nodes[n + i].setRightChild(x2);
		}
	}

	public void haffmanCode(HaffNode[] nodes, Code[] haffCode) {
		int n = this.nodeNum;
		Code code = new Code(n);
		int child, parent;
		for (int i = 0; i < n; i++) {
			code.setStart(n - 1);
			code.setWeight(nodes[i].getWeight());
			child = i;
			parent = nodes[child].getParent();
			while (parent != 0) {
				if (nodes[parent].getLeftChild() == child) {
					code.getBit()[code.getStart()] = 0;
				} else {
					code.getBit()[code.getStart()] = 1;
				}
				code.setStart(code.getStart() - 1);
				child = parent;
				parent = nodes[child].getParent();
			}

			Code temp = new Code(n);
			for (int j = code.getStart() + 1; j < n; j++) {
				temp.getBit()[j] = code.getBit()[j];
			}
			temp.setWeight(code.getWeight());
			temp.setStart(code.getStart());

			haffCode[i] = temp;
		}
	}
}
