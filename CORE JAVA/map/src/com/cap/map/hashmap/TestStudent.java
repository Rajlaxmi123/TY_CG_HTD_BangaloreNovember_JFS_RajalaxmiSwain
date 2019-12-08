package com.cap.map.hashmap;

import java.util.HashMap;

import java.util.Collection;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
HashMap<Integer,Student> h1 = new HashMap<Integer,Student>();
		
		
		h1.put(34, null);
		h1.put(null, new Student(45,"gjbb"));
		h1.put(35, new Student(45,"gjbbkkkl"));
		h1.put(36, new Student(47,"gjbrgb"));
		h1.put(37, new Student(40,"gjbbhjkk"));
		h1.put(38, new Student(49,"gjbbzxc"));
		
		
		
		

		Collection<Student> c1 = h1.values();
		
		for(Student s1 : c1)
		{
			System.out.println(s1);
		}
		
	
		System.out.println(h1.containsKey(3));
		System.out.println(h1.containsValue(new Student(8,"suresh")));
		
		
		
		
		
		
		
		System.out.println(h1.containsKey(34));
	
		System.out.println(h1.containsValue(new Student(8,"suresh")));
		
		
		
		
		
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		
		
		
		
		
	}

}
