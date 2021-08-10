package com.tcs.entity;

public class VarArgsDemo {
	public static void main(String[] args) {
		String[] subjects = { "Math", "English" };
		Student student = new Student(subjects);
		System.out.println(student.subjects[0]);

		Student student1 = new Student("Science");
		System.out.println(student1.subjects[0]);
	}
}

class Student {
	String[] subjects;

//	public Student(String[] subjects) { //Can pass only array
//		this.subjects = subjects;
//	}
// VarArgs Is Special Case of OverLoading
	public Student(String... subjects) { // VarArgs , more flexible
		this.subjects = subjects;
	}
}
