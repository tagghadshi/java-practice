package com.tcs.entity;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "TCS"; // Stringpool
		String s2 = new String("TCS");// It goes to heap
		String s3 = s1 + s2; // Heap memory
		System.out.println(s1 == s2); // false
		StringBuilder sb = new StringBuilder("TCS");
		sb.append(",Banglore");
	}

}
