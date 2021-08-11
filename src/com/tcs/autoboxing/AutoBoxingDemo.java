package com.tcs.autoboxing;

public class AutoBoxingDemo {
	public static void main(String[] args) {
		int a = 1; //primitive
		Integer ref = a; //object
		int b = ref;
		// primitive to object AutoBoxing
		//object to primitive Unboxing
		System.out.println(a==ref);
		System.out.println(a==b);
	}
}
