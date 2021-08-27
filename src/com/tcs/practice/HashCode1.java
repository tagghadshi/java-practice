package com.tcs.practice;

public class HashCode1 {
	public static void main(String[] args) {
		User1 u1 = new User1("Ram");
		System.out.println(u1.hashCode());
		User1 u2 = new User1("Ram");
		System.out.println(u2.hashCode());
		System.out.println(u2.equals(u1));
		System.out.println(u1==u2);
	}
}

class User1 {
	String name;

	public User1(String name) {
		this.name = name;
	}

//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
}