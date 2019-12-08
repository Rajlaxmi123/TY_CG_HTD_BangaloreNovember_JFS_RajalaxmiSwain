package com.cap.looseCoupling.looseCoupling;

public class Crush {
	void recieve(Phone p)
	{
		if(p instanceof BasicSet)
		{
			System.out.println("Thanks");
		}
		else if(p instanceof Oppo)
		{
			System.out.println("Thank you");
		}
		else if(p instanceof Apple)
		{
			System.out.println("Love You");
		}
		else 
		{
			System.out.println("Idiot");
		}
	}

}
