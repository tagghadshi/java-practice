package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		System.out.println(numbers);
		numbers.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});// Comparator is inbuilt interface it will help to decide
		System.out.println("After Sorting " + numbers);
	}

	private static List<Integer> createList() {
		List<Integer> numbers = new ArrayList<Integer>(); // Generic
		numbers.add(1); // autoboxing
//		numbers.add("Ram");//not allowed as generic list
		System.out.println(numbers.get(0));// get method returns Integer

		for (int count = 0; count < 20; count++) {
			numbers.add(count);
		}
		return numbers;
	}
}
