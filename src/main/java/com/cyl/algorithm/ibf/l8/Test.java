package com.cyl.algorithm.ibf.l8;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		s.add('a');
		s.add('b');
		s.push('c');
		Character peek = s.peek();
		System.out.println(peek);
		System.out.println(s);
	}

}
