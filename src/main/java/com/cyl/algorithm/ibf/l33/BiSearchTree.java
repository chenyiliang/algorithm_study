package com.cyl.algorithm.ibf.l33;

import java.util.Vector;

public class BiSearchTree {
	private BiTreeNode root;
	Vector<Object> vector = new Vector<Object>();

	public BiTreeNode getRoot() {
		return root;
	}

	public void setRoot(BiTreeNode root) {
		this.root = root;
	}

	private void inOrder(BiTreeNode t, Visit vs) {
		if (t != null) {
			inOrder(t.getLeft(), vs);
			vs.print(new Integer(t.getData()));
			inOrder(t.getRight(), vs);
		}
	}

	private void preOrder(BiTreeNode t, Visit vs) {
		if (t != null) {
			vs.print(new Integer(t.getData()));
			preOrder(t.getLeft(), vs);
			preOrder(t.getRight(), vs);
		}
	}

	public void inOrder(Visit vs) {
		inOrder(root, vs);
	}

	public void preOrder(Visit vs) {
		preOrder(root, vs);
	}

	public BiTreeNode getLeft(BiTreeNode current) {
		return current != null ? current.getLeft() : null;
	}

	public BiTreeNode getRight(BiTreeNode current) {
		return current != null ? current.getRight() : null;
	}

	public BiTreeNode find(int item) {
		if (root != null) {
			BiTreeNode temp = root;
			while (temp != null) {
				if (temp.getData() == item) {
					return temp;
				}
				if (temp.getData() < item) {
					temp = temp.getRight();
				} else {
					temp = temp.getLeft();
				}
			}
		}
		return null;
	}

	public void insert(BiTreeNode ptr, int item) {
		if (item < ptr.getData()) {
			if (ptr.getLeft() == null) {
				BiTreeNode temp = new BiTreeNode(item);
				temp.setParent(ptr);
				ptr.setLeft(temp);
			} else {
				insert(ptr.getLeft(), item);
			}
		} else if (item > ptr.getData()) {
			if (ptr.getRight() == null) {
				BiTreeNode temp = new BiTreeNode(item);
				temp.setParent(ptr);
				ptr.setRight(temp);
			} else {
				insert(ptr.getRight(), item);
			}
		}
	}

	public void delete(BiTreeNode ptr, int item) {
		if (ptr != null) {
			if (item < ptr.getData()) {
				// 在左子树递归
				delete(ptr.getLeft(), item);
			} else if (item > ptr.getData()) {
				// 在右子树递归
				delete(ptr.getRight(), item);
			} else if (ptr.getLeft() != null && ptr.getRight() != null) {
				// 要删除结点寻找到，并且要删除结点左右子树均存在的情况
				BiTreeNode min = ptr.getRight();// 取当前结点的右孩子结点
				while (min.getLeft() != null) {
					min = min.getLeft();// min取到最左孩子结点
				}
				ptr.setData(min.getData());// 把min的数据值赋给ptr结点
				delete(ptr.getRight(), min.getData());
				// 在ptr结点的右子树中递归删除min结点
			} else {
				if (ptr.getLeft() == null && ptr.getRight() != null) {
					// 要删除结点寻找到，并且要删除结点只有右子树的情况
					ptr.getParent().setRight(ptr.getRight());
					// 让ptr双亲的左孩子结点指向ptr结点的左孩子结点
					ptr.getRight().setParent(ptr.getParent());
					// 让ptr左孩子的双亲指向ptr的双亲结点
				} else if (ptr.getRight() == null && ptr.getLeft() != null) {
					// 要删除结点寻找到，并且要删除结点只有左子树的情况
					ptr.getParent().setLeft(ptr.getLeft());
					// 让ptr双亲的左孩子结点指向ptr结点的左孩子结点
					ptr.getLeft().setParent(ptr.getParent());
					// 让ptr左孩子的双亲指向ptr的双亲结点
				} else {
					// 要删除结点寻找到，并且要删除结点为叶结点的情况
					BiTreeNode p = ptr.getParent();
					if (p.getLeft() == ptr) // 若要删除结点在双亲的左孩子上
						p.setLeft(null); // 把双亲的左孩子置空
					else
						// 若要删除结点在双亲的右孩子上
						p.setRight(null); // 把双亲的右孩子置空
				}
			}
		}
	}

}
