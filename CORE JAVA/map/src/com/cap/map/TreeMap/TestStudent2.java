package com.cap.map.TreeMap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(23,"raj"));
		a1.add(new Student(24,"raghav"));
		
		ArrayList<Student> a2 = new ArrayList<Student>();
		a2.add(new Student(23,"rajhgfhj"));
		a2.add(new Student(24,"raghavgh"));
		
		ArrayList<Student> a3 = new ArrayList<Student>();
		a3.add(new Student(23,"rajs"));
		a3.add(new Student(24,"raghavgdgd"));
		
		
		
		TreeMap<String,ArrayList> t1 = new TreeMap<String,ArrayList>();
		t1.put("1st Standard", a1);
		t1.put("2nd Standard", a2);
		t1.put("3rd Standard", a3);
		
		
		
		Set<Map.Entry<String,ArrayList>>s1 =t1.entrySet();

		for(Map.Entry<String,ArrayList> e1 : s1)
		{
			System.out.println(e1.getValue());
			System.out.println(e1.getKey());
		}
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
