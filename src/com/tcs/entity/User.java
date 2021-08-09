package com.tcs.entity;

public class User {
	private String name;
	private long mobileNumber;
	private byte age; // data encapsulation declaring private
	
	public void workout() {
		System.out.println(name + " is working out...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", mobileNumber=" + mobileNumber + ", age=" + age + "]";
	}

	
}
