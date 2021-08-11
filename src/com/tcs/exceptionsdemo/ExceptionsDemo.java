package com.tcs.exceptionsdemo;

public class ExceptionsDemo {
	public static void main(String[] args) throws MyCheckedException {
		
//		demo1();
		demo2();
	}

	private static void demo2() throws MyCheckedException {
		throw new MyCheckedException();
	}
	
	private static void demo1() {
		//Handling Exception
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Division by zero is not Allowed");
		}
	}
}
