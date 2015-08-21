package com.cyl.algorithm.ibf.l10;

import com.cyl.algorithm.ibf.l9.Queue;

public class Test {

	public static void main(String[] args) throws Exception {
		Queue queue = new LinkQueue();
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
