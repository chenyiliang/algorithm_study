package com.cyl.algorithm.ibf.l10;

public class Element {
	private Object element;
	private int priority;

	public Element(Object element, int priority) {
		this.element = element;
		this.priority = priority;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Element [element=" + element + ", priority=" + priority + "]";
	}

}
