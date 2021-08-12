package com.tcs.map.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// STudent marks for math, biology and physics
public class HashMapDemo {
	
	public static void main(String[] args) {
//		createHashMap();
		studentsHashMap();
	}

	private static void studentsHashMap() {
		Map<Students, Subjects> students = new HashMap<Students, Subjects>();
		for (int i = 0; i < 10; i++) {
			students.put(new Students(i), new Subjects(new Float(100 * Math.random()),new Float(100 * Math.random()),new Float(100 * Math.random())));
		}
		System.out.println(students);
	}

	private static void createHashMap() {
		Map<String, Float> mathScores = new HashMap<String, Float>();
		for (int i = 0; i < 20; i++) {
			mathScores.put("student" + i, new Float(100 * Math.random()));
		}
		System.out.println(mathScores);
	}
}
