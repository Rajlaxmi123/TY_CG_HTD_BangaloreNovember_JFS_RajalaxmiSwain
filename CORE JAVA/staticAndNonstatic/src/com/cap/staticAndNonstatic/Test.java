package com.cap.staticAndNonstatic;

public class Test {
	public static void main(String args[])
	{
		Person p1= new Person();
		p1.name="John";
		Person.age=23;
		p1.personDetails();
		Person.personDetailsstatic();
	}

}
