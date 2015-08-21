package com.cyl.algorithm.ibf.l35;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class MD5JavaTest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// 创建具有MD5算法的信息摘要
		MessageDigest md = MessageDigest.getInstance("MD5");
		// 使用指定的字节数组对摘要进行最后更新，然后完成摘要计算
		byte[] results = md.digest("hello".getBytes());
		for (int j = 0; j < results.length; j++) {
			if (results[j] < 0) {
				System.out.println(Integer.toHexString(results[j] + 256) + ":"
						+ Integer.toBinaryString(results[j]));
			} else {
				System.out.println(Integer.toHexString(results[j]) + "*"
						+ Integer.toBinaryString(results[j]));
			}
		}
	}

}
