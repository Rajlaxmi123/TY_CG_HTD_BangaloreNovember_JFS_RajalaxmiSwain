package com.cap.collection.HashSet;

import java.util.HashSet;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Student> h1 = new HashSet<Student>() ;
		
		h1.add(new Student(22,"divya"));
		h1.add(new Student(23,"ANU"));
		h1.add(new Student(24,"Ramesh"));
		h1.add(new Student(24,"Divya"));
		h1.add(new Student(24,"ramesh"));
		
		for(Student s1 : h1)
		{
			System.out.println(s1.name +" and age is " + s1.age);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
