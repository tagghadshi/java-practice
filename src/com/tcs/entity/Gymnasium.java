package com.tcs.entity;

import java.util.ArrayList;
import java.util.List;

public class Gymnasium {
	//Generic list of type User
	static List<User> users = new ArrayList<>();
	public static void main(String[] args) {
		createUsers();
	}
	private static void createUsers() {
		for (int i = 0; i < 10; i++) {
			User u1 = new User("Ram",43563353L,(byte)(10*i));
//			u1.setName("Ram"+i);
//			u1.setAge((byte) (10*i));
//			u1.setMobileNumber(10000000*i);
			users.add(u1);
		}
		//System.out.println(users);
		users.get(0).workout();
	}
}
