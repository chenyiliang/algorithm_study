package com.cyl.algorithm.ibf.l33;

public class BiTreeSearchTest {
	public static void main(String[] args) {
		BiSearchTree searchTree = new BiSearchTree();
		int[] a = { 4, 5, 7, 2, 1, 9, 8, 11, 3 };
		Visit vs = new Visit();
		BiTreeNode temp = new BiTreeNode(a[0]);

		for (int i = 1; i < a.length; i++) {
			searchTree.insert(temp, a[i]);
		}
		searchTree.setRoot(temp);

		System.out.println("构造完成后：");
		System.out.println("中序遍历序列为：");
		searchTree.inOrder(vs);
		System.out.println("\r\n前序遍历序列为：");
		searchTree.preOrder(vs);
		System.out.println();

		System.out.println("查找的数据元素为：");
		System.out.println(searchTree.find(9).getData());

		searchTree.delete(searchTree.getRoot(), 4);

		System.out.println("删除结点4后：");
		System.out.print("中序遍历序列为：");
		searchTree.inOrder(vs);
	}
}
