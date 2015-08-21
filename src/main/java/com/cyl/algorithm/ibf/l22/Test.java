package com.cyl.algorithm.ibf.l22;

import com.cyl.algorithm.ibf.l20.BiTree;
import com.cyl.algorithm.ibf.l20.BiTreeNode;

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
		MyBiTreeIterator it = new MyBiTreeInIterator(root);
		for (it.reset(); !it.endOfBiTree(); it.next()) {
			System.out.println(it.getData());
		}

		/*BiTreeNode farLeft = new MyBiTreeInIterator().getFarLeft(root);
		System.out.println(farLeft.getData());*/
	}

}
