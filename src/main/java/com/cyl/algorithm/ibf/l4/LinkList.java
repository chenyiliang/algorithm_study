package com.cyl.algorithm.ibf.l4;

import com.cyl.algorithm.ibf.l3.List;

public class LinkList implements List {
	private Node head;
	private Node current;
	int size;

	public LinkList() {
		this.head = this.current = new Node(null);
		this.size = 0;
	}

	public void index(int index) throws Exception {
		if (index < -1 || index > size - 1) {
			throw new Exception("参数错误");
		}
		if (index == -1) {
			return;
		}

		this.current = head.getNext();
		int j = 0;
		while (current != null && j < index) {
			this.current = current.getNext();
			j++;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void insert(int index, Object obj) throws Exception {
		if (index < 0 || index > size) {
			throw new Exception("参数错误!");
		}
		index(index - 1);
		current.setNext(new Node(obj, current.getNext()));
		size++;
	}

	@Override
	public void delete(int index) throws Exception {
		if (isEmpty()) {
			throw new Exception("链表为空，无法删除");
		}
		if (index < 0 || index > size) {
			throw new Exception("参数错误!");
		}
		index(index - 1);
		current.setNext(current.getNext().getNext());
		size--;
	}

	@Override
	public Object get(int index) throws Exception {
		index(index);
		return current.getElement();
	}

	@Override
	public String toString() {
		String str = "[";
		Node current = this.head.getNext();
		while (current != null) {
			if (current.getNext() != null) {
				str += current.getElement() + ",";
			} else {
				str += current.getElement();
			}
			current = current.getNext();
		}
		return str + "]";
	}

}
