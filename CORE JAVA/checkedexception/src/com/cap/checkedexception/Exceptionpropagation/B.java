package com.cap.checkedexception.Exceptionpropagation;

public class B {

	static void o() throws ClassNotFoundException
	{
		Class.forName("Exceptionporopagation.A");
	}
	
	
}
