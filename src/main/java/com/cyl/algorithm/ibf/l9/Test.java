package com.cyl.algorithm.ibf.l9;

public class Test {

	public static void main(String[] args) throws Exception {
		CircleSequenceQueue queue = new CircleSequenceQueue();
		System.out.println(queue);
		for (int i = 0; i < 8; i++) {
			queue.append(i);
		}
		System.out.println(queue);
		for (int i = 0; i < 3; i++) {
			queue.delete();
		}
		System.out.println(queue);
		for (int i = 0; i < 5; i++) {
			queue.append(i);
		}
		System.out.println(queue);
	}

}
