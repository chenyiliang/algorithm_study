package com.cyl.algorithm.ibf.l4;

public class Node {
	private Object element;
	private Node next;

	public Node(Node nextval) {
		this.next = nextval;
	}

	public Node(Object obj, Node nextval) {
		this.element = obj;
		this.next = nextval;
	}

	public Node getNext() {
		return this.next;
	}

	public Object getElement() {
		return this.element;
	}

	public void setNext(Node nextval) {
		this.next = nextval;
	}

	public void setElement(Object obj) {
		this.element = obj;
	}

	@Override
	public String toString() {
		return this.element.toString();
	}

}
