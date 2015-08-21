package com.cyl.algorithm.ibf.l20;

public class Test {

	public static BiTreeNode makeTree() {
		BiTreeNode b, c, d, e, f, g;
		g = BiTree.getTreeNode(new Character('G'), null, null);
		d = BiTree.getTreeNode(new Character('D'), null, g);
		b = BiTree.getTreeNode(new Character('B'), d, null);
		e = BiTree.getTreeNode(new Character('E'), null, null);
		f = BiTree.getTreeNode(new Character('F'), null, null);
		c = BiTree.getTreeNode(new Character('C'), e, f);
		return BiTree.getTreeNode(new Character('A'), b, c);
	}

	public static void main(String[] args) {
		BiTreeNode root = makeTree();
		// BiTree.printBiTree(root, 0);

		Traverse.preOrder(root, new Visit());
	}

}
