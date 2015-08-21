package com.cyl.algorithm.ibf.l7;

import com.cyl.algorithm.ibf.l5.Node;
import com.cyl.algorithm.ibf.l6.Stack;

public class LinkStack implements Stack {
	private Node head;
	private int size;

	public LinkStack() {
		this.head = null;
		this.size = 0;
	}

	@Override
	public void push(Object obj) throws Exception {
		head = new Node(obj, head);
		size++;
	}

	@Override
	public Object pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("栈为空！");
		}
		Object obj = head.getElement();
		head = head.getNext();
		size--;
		return obj;
	}

	@Override
	public Object getTop() throws Exception {
		// TODO Auto-generated method stub
		return head.getElement();
	}

	@Override
	public boolean isEmpty() throws Exception {
		// TODO Auto-generated method stub
		return head == null;
	}

}
