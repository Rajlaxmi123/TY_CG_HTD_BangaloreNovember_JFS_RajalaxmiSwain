package com.cap.exception.ExceptionPropagation;

public class TestB {
	static void n()
	{
		try {
		TestC.m();
	}catch(ArithmeticException e )
		{
		System.out.println("Bclass"+e.getMessage());
		throw e;
		}
	}

}
