package com.cyl.algorithm.ibf.l18;

public class GCDNumber {
	public static int gcd(int small, int big) {
		if (big < 0 || small < 0) {
			return -1;
		} else if (small == 0) {
			return big;
		} else if (big < small) {
			return gcd(big, small);
		} else {
			return gcd(small, big % small);
		}
	}

	public static void main(String[] args) {
		System.out.println(gcd(7, 13));
	}

}
