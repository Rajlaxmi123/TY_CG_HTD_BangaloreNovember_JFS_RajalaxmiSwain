package com.cap.exception.ExceptionPropagation;

public class TestC {
	static void m()
	{
		try {
		System.out.println(10/0);
	}catch(ArithmeticException e )
		{
		System.out.println(e.getMessage());
		throw e;
		}
	}
}
