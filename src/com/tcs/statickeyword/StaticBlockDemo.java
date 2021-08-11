package com.tcs.statickeyword;

public class StaticBlockDemo {
	static int age=10;
	int price = 20; //cannot be accessed in static block/method
	public StaticBlockDemo() {
		System.out.println("in constructor ...");
	}
	
	static {//called first , loaded when startup
		System.out.println("this is a static block "+age);
	}
	
	public static void main(String[] args) {
		StaticBlockDemo blockDemo = new StaticBlockDemo();
		new StaticBlockDemo();
		
	}
	
	void work() {
//		static int time=45;//local variable cannot be marked static
	}
}
