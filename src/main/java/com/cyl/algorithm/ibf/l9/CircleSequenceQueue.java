package com.cyl.algorithm.ibf.l9;

public class CircleSequenceQueue implements Queue {

	private static final int defaultSize = 10;
	private int front;// 头
	private int rear;// 尾
	private int count;
	private int maxSize;
	private Object[] queue;

	public CircleSequenceQueue() {
		init(defaultSize);
	}

	public CircleSequenceQueue(int size) {
		init(size);
	}

	public void init(int size) {
		this.maxSize = size;
		this.front = this.rear = 0;
		queue = new Object[maxSize];
		this.count = 0;
	}

	@Override
	public void append(Object obj) throws Exception {
		if (count > 0 && front == rear) {
			throw new Exception("队列已满！");
		}
		this.queue[rear] = obj;
		rear = (rear + 1) % maxSize;
		count++;
	}

	@Override
	public Object delete() throws Exception {
		if (isEmpty()) {
			throw new Exception("队列为空！");
		}
		Object obj = queue[front];
		front = (front + 1) % maxSize;
		count--;
		return obj;
	}

	@Override
	public Object getFront() throws Exception {
		if (!isEmpty()) {
			return queue[front];
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
		for (int i = 0; i < count - 1; i++) {
			str += queue[(front + i) % maxSize] + ",";
		}
		if (count > 0) {
			str += queue[(front + count - 1) % maxSize];
		}
		str += "]";
		return str;
	}

}
