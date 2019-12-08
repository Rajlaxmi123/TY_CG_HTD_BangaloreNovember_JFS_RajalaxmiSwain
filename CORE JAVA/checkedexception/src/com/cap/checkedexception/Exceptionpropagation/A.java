package com.cap.checkedexception.Exceptionpropagation;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main started");
try {
	D.m();
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	System.out.println("exception handled");
}

System.out.println("main ended");
	}

}
