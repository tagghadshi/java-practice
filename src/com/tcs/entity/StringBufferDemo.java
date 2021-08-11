package com.tcs.entity;

public class StringBufferDemo {
	public static void main(String[] args) {
		String literal = "TCS"; // string pool
		String newKeyword = new String("TCS"); // heap immutable
		StringBuilder strBuilder = new StringBuilder(); // heap, mutable ,not thread safe
		StringBuffer strBuffer = new StringBuffer(); // heap,mutable , thread safe
	}
}
