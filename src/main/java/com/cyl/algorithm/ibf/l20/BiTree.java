package com.cyl.algorithm.ibf.l20;

public class BiTree {
	private BiTreeNode root;

	public BiTree() {
		// TODO Auto-generated constructor stub
	}

	public BiTree(Object data, BiTree left, BiTree right) {
		BiTreeNode l, r;
		if (left == null) {
			l = null;
		} else {
			l = left.root;
		}

		if (right == null) {
			r = null;
		} else {
			r = right.root;
		}

		this.root = new BiTreeNode(data, l, r);
	}

	public static void printBiTree(BiTreeNode root, int level) {
		if (root != null) {
			printBiTree(root.getRightChild(), level + 1);
			if (level != 0) {
				for (int i = 0; i < 6 * (level - 1); i++) {
					System.out.print(" ");
				}
				System.out.print("-----");
			}
			System.out.println(root.getData());
			printBiTree(root.getLeftChild(), level + 1);
		}
	}

	public static BiTreeNode getTreeNode(Object data, BiTreeNode left,
			BiTreeNode right) {
		BiTreeNode node = new BiTreeNode(data, left, right);
		return node;

	}

	// 查找
	public static BiTreeNode search(BiTreeNode root, Object obj) {
		BiTreeNode node = null;
		if (root == null) {
			return null;
		} else if (root.getData().equals(obj)) {
			return root;
		} else if (root.getLeftChild() != null) {
			node = search(root.getLeftChild(), obj);
		} else if (root.getRightChild() != null) {
			node = search(root.getRightChild(), obj);
		}
		return node;
	}

}
