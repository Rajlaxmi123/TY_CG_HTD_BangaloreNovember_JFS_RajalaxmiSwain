package com.tyss.accessspecifier.pack1;

public class Person {
	public static int age=23;
	public String name;
	public Person(String name)
	{
		this.name=name;
	}
	public void personDetails()
	{
		System.out.println(name);
	}
	public static void details()
	{
		System.out.println("age is "+age);
	}
	

}
