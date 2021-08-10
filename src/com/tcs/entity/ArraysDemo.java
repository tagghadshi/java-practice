package com.tcs.entity;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		EnchanceForLoop();
		// demo();
	}

	public static void EnchanceForLoop() {
		int[] numbers = { 3, 4, -1, 2, 6 };
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}

	public static void demo() {
		int[] numbers = new int[10];
		numbers[0] = 5;
		numbers[4] = 2;
		Arrays.sort(numbers, 0, numbers.length);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
