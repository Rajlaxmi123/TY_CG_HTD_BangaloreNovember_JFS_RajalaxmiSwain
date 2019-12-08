package com.cap.collection.TreeSet;

public class Student implements Comparable<Student>{

	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if(this.age>o.age)
		{
			return 1;
		}
		else if(this.age<o.age)
		{
			return -1;
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
