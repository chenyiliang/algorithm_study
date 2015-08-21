package com.cyl.algorithm.ibf.l5;

public class Game {
	private CycleLinkList list = new CycleLinkList();
	private int num;
	private int key;

	public Game(int num, int key) {
		this.num = num;
		this.key = key;
	}

	public void play() throws Exception {
		for (int i = 0; i < num; i++) {
			list.insert(i, i);
		}
		System.out.println(list);
		
		int iCount=num;
		int j;
	}

	public static void main(String[] args) throws Exception {
		new Game(10, 3).play();
	}
}
