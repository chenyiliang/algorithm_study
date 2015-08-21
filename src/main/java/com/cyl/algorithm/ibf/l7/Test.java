package com.cyl.algorithm.ibf.l7;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		LinkStack stack = new LinkStack();

		Scanner scanner = new Scanner(System.in);
		int temp;
		for (int i = 0; i < 10; i++) {
			System.out.println("请输入第" + (i + 1) + "个整数：");
			temp = scanner.nextInt();
			stack.push(temp);
		}
		scanner.close();

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
