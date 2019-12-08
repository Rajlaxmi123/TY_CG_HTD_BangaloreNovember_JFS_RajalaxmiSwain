package com.cap.exception.ExceptionPropagation;

public class TestA {
static void o()
{try {
	TestB.n();
}catch(ArithmeticException e) 
{
	System.out.println("A class"+e.getMessage());
	
}
}
}
