package com.cyl.algorithm.ibf.l10;

import com.cyl.algorithm.ibf.l5.Node;
import com.cyl.algorithm.ibf.l9.Queue;

public class LinkQueue implements Queue {
	private Node front;
	private Node rear;
	int count;

	public LinkQueue() {
		init();
	}

	public void init() {
		this.front = this.rear = null;
		this.count = 0;
	}

	@Override
	public void append(Object obj) throws Exception {
		Node node = new Node(obj, null);
		if (rear != null) {
			rear.setNext(node);
		}
		rear = node;
		if (front == null) {
			front = node;
		}
		count++;
	}

	@Override
	public Object delete() throws Exception {
		if (isEmpty()) {
			throw new Exception("队列已空！");
		}
		Node node = front;
		front = front.getNext();
		count--;
		return node.getElement();
	}

	@Override
	public Object getFront() throws Exception {
		if (!isEmpty()) {
			return front.getElement();
		} else {
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public String toString() {
		String str = "[";
		Node tmp = front;
		for (int i = 0; i < count - 1; i++) {
			str += tmp.getElement() + ",";
			tmp = tmp.getNext();
		}
		if (rear != null) {
			str += rear.getElement();
		}
		str += "]";
		return str;
	}

}
