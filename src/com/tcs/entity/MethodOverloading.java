package com.tcs.entity;

public class MethodOverloading {
	public static void main(String[] args) {
		User1 user1= new User1();
		user1.work();
		user1.work(4);
		user1.work("5");
	}
}
class User1{
	public void work() {
		System.out.println("User is Working");
	}
	
	public void work(int duration) {
		System.out.println("User is Working for "+duration + "hours");
	}
	
	public void work(String duration) {
		System.out.println("User is Working for "+duration + "hours");
	}
}