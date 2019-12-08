package com.cap.looseCoupling.looseCoupling;

public class TestPhone {
	public static void main (String args[])
	{
		 Crush c1=new Crush();
		 BasicSet b1= new BasicSet();
		 Oppo o1=new Oppo();
		 Apple a1=new Apple();
		 
		 c1.recieve(null);
		 c1.recieve(a1);
	}
	

}
