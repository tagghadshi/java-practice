package com.tcs.entity;

public class MethodOverloading {
	public static void main(String[] args) {
		User1 user1 = new Employee1();
		user1.work();
		user1.work(4);
		user1.work("5");
	}
}

class User1 {
	public void work() {
		System.out.println("User is Working");
	}

	public void work(int duration) {
		System.out.println("User is Working for " + duration + " hours");
	}

	public void work(String duration) {
		System.out.println("User is Working for " + duration + "hours");
	}
}

class Employee1 extends User1 {// IS-A Relationship = inheritance ,sub-class
	@Override
	public void work() {
		super.work();
		System.out.println("Employee is Working");
	}

	public void work(boolean duration) {
		System.out.println("Employee is Working");
	}
}