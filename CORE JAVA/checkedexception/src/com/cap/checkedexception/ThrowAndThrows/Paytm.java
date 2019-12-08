package com.cap.checkedexception.ThrowAndThrows;

public class Paytm {
	
	IRCTC i1;

	public Paytm(IRCTC i1) {
		super();
		this.i1 = i1;
	}
	 void bookTicket()
	 {
		 try {
		 i1.confirmticket();
	 }catch(ClassNotFoundException c)
		 {
		 System.out.println(" ticket is not confirmed");
		 }
		 
	 }
}
