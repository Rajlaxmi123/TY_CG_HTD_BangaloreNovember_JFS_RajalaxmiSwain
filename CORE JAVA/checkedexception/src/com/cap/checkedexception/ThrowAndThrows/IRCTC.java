package com.cap.checkedexception.ThrowAndThrows;

public class IRCTC {
	
	void confirmticket() throws ClassNotFoundException
	{ 
		try {
		Class.forName("ThrowAndThrows.Paytm");
		System.out.println("ticket is confirmed");
	}catch(ClassNotFoundException c)
	{
		System.out.println(" ticket is not confirmed");
		throw c;
	}

}
}
