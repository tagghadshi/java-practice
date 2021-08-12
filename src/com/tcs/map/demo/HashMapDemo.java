package com.tcs.map.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// STudent marks for math, biology and physics
public class HashMapDemo {
	
	public static void main(String[] args) {
//		createHashMap();
//		studentsHashMap();
		treeMap();
		
	}

	private static void treeMap() {
		Map<Integer, Float> mathScores = new TreeMap<Integer, Float>();
		for (int i = 0; i < 20; i++) {
			mathScores.put( i, new Float(100 * Math.random()));
		}
		System.out.println(mathScores);
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
		boolean exists = mathScores.containsKey("student1");
		System.out.println(exists);
//		mathScores.containsValue(value)
		mathScores.put("student1", 54F);
		mathScores.remove("student1");
		System.out.println(mathScores);
		System.out.println(mathScores.size());
	}
}
