package com.cap.staticAndNonstatic;

public class Person {
	static int age;
	String name;
	void personDetails()
	{
		System.out.println("name"+name);
		System.out.println("age"+age);
		
	}

	static void personDetailsstatic() {
		System.out.println("age"+age);
	}
}
