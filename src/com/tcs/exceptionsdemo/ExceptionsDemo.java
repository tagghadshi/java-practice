package com.tcs.exceptionsdemo;

public class ExceptionsDemo {
	public static void main(String[] args) {

//		demo1();
			try {
				demo2();
			} catch (InvalidInputException e) {
				e.printStackTrace();
			} catch (MyCheckedException e) {
				e.printStackTrace();
			}finally {
				System.out.println("always called");
			}
	}

	private static void demo2() throws MyCheckedException ,InvalidInputException {
		throw new MyCheckedException();
	}

	private static void demo1() {
		// Handling Exception
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Division by zero is not Allowed");
		}
	}
}
