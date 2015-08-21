package com.cyl.algorithm.ibf.l3;

public class SequenceList implements List {
	private final int defaultSize = 10;
	private int maxSize;
	private int size;
	Object[] listArray;

	public SequenceList() {
		init(defaultSize);
	}

	public SequenceList(int size) {
		init(size);
	}

	private void init(int size) {
		this.maxSize = size;
		this.size = 0;
		this.listArray = new Object[size];
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
		if (size == maxSize) {
			throw new Exception("顺序表已满，无法插入！");
		}
		if (index < 0 || index > size) {
			throw new Exception("参数错误!");
		}

		for (int j = size; j > index; j--) {
			listArray[j] = listArray[j - 1];
		}

		listArray[index] = obj;
		size++;
	}

	@Override
	public void delete(int index) throws Exception {
		if (isEmpty()) {
			throw new Exception("顺序表为空，无法删除！");
		}

		if (index < 0 || index > size - 1) {
			throw new Exception("参数错误");
		}

		for (int j = index; j < size - 1; j++) {
			listArray[j] = listArray[j + 1];
		}
		size--;
	}

	@Override
	public Object get(int index) throws Exception {
		if (index < 0 || index >= size) {
			throw new Exception("参数错误！");
		}
		return listArray[index];
	}

}
