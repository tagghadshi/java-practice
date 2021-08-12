package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraylistDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
//		System.out.println(numbers);
//		sortList(numbers);
//		filterList(numbers);
//		add(numbers);
		otherOps(numbers);
	}

	private static void otherOps(List<Integer> numbers) {
		System.out.println(numbers);
//		numbers.remove(11);//removes at specific index
//		numbers.add(50);//add at end
		numbers.add(1, 50);// adds at specific index
		System.out.println(numbers);
	}

	private static void add(List<Integer> numbers) {
		Optional<Integer> sum1 = numbers.stream().reduce((Integer sum, Integer number) -> {
			System.out.println(sum + ", " + number);
			return sum + number;
		});
		System.out.println(sum1.get());

	}

	/**
	 * Method to filter elements
	 * 
	 * @param numbers
	 */
	private static void filterList(List<Integer> numbers) { // Functional Programming
		numbers.forEach((number) -> {
			System.out.println(number % 2 == 0);
		});
		List<Integer> filtered = numbers.stream() // send elements one by one
				.filter((number) -> number % 2 == 0) // Lambda Function
				.collect(Collectors.toList());
		System.out.println(filtered);
	}

	private static void sortList(List<Integer> numbers) {
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
