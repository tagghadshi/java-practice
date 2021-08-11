package com.tcs.exceptionsdemo.unchecked;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		User user = new User();
		user.work(); // No Exception will be throw as RuntimeException no need to handle
	}
}

class User {
	int age = 70;

	public void work() {
		if (age <= 18) {
			throw new UnderAgeException("No Child Labour");
//			System.out.println("Unreachable code");
		} else if (age > 60) {
			throw new OverAgeException("Age should not be greater than 60 years");
		}
	}
}
