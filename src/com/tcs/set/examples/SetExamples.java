package com.tcs.set.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	// set does not contain order of insertion
	public static void main(String[] args) {
//		hashSet();
		treeSetDemo();
	}

	private static Set<User> treeSetDemo() {
		Set<User> users = new TreeSet<User>();
		for (int count = 0; count < 20; count++) {
			User user = new User();
			user.setAge(10 + count);
			users.add(user);
		}
		System.out.println(users);
		return users;
	}

	private static void hashSet() {
		Set<User> users = createSet();
		System.out.println(users);
		User userWithSameAge = new User();
		userWithSameAge.setAge(10);
		users.add(userWithSameAge);
		System.out.println(users);
	}

	private static Set<User> createSet() {
		Set<User> users = new HashSet<User>();
		for (int count = 0; count < 20; count++) {
			User user = new User();
			user.setAge(10 + count);
			users.add(user);
		}
		return users;
	}

}
