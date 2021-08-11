package com.tcs.staticimport;

import java.util.Arrays.*; //Normal import
//import static java.util.Arrays.*; //Static import

import java.util.Arrays;

public class FileReader {
	public static void main(String[] args) {
		int[] numbers = { 5, 6, -1, 3, 5 };
//		sort(numbers); // use of static import
		Arrays.sort(numbers); // use of normal import
	}
}
