package com.cap.checkedexception.customchecked;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Election e1 = new Election();
try {
e1.vote(19);
}catch(AgeLimitException e)
{
	System.out.println(e.getMessage());
}


System.out.println("main ended");

	}

}
