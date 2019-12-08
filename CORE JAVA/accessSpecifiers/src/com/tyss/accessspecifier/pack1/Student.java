package com.tyss.accessspecifier.pack1;
public class Student {

	protected String studName;
	protected Student(String name)
	{
		this.studName=name;
	}
	
	protected void studDetails()
	{
		System.out.println(" student name is "+studName);
	}

	
}
