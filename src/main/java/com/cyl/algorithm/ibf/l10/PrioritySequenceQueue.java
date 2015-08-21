package com.cyl.algorithm.ibf.l10;

import java.util.Iterator;

import com.cyl.algorithm.ibf.l9.Queue;

public class PrioritySequenceQueue implements Queue {
	private final int defaultSize = 10;
	// private int front;
	private int rear;
	private int count;
	private int maxSize;
	private Element[] queue;

	public PrioritySequenceQueue() {
		init(defaultSize);
	}

	public PrioritySequenceQueue(int size) {
		init(size);
	}

	public void init(int size) {
		this.maxSize = size;
		this.rear = 0;
		this.count = 0;
		this.queue = new Element[size];
	}

	@Override
	public void append(Object obj) throws Exception {
		if (count >= maxSize) {
			throw new Exception("队列已满！");
		}
		queue[rear] = (Element) obj;
		rear++;
		count++;
	}

	@Override
	public Object delete() throws Exception {
		if (isEmpty()) {
			throw new Exception("队列为空");
		}

		Element min = queue[0];
		int minIndex = 0;
		for (int i = 0; i < count; i++) {
			if (queue[i].getPriority() < min.getPriority()) {
				min = queue[i];
				minIndex = i;
			}
		}

		for (int i = minIndex + 1; i < count; i++) {
			queue[i - 1] = queue[i];
		}
		rear--;
		count--;
		return min;
	}

	@Override
	public Object getFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("队列为空");
		}

		Element min = queue[0];
		for (int i = 0; i < count; i++) {
			if (queue[i].getPriority() < min.getPriority()) {
				min = queue[i];
			}
		}
		return min;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count == 0;
	}

}
