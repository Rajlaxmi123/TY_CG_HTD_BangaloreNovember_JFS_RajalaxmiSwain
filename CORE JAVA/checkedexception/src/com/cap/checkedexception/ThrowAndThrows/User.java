package com.cap.checkedexception.ThrowAndThrows;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
IRCTC i1 = new  IRCTC();

Paytm p1 = new Paytm(i1);
p1.bookTicket();


System.out.println("main ended");
	}

}
