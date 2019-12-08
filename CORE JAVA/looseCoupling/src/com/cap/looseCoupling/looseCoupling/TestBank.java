package com.cap.looseCoupling.looseCoupling;

public class TestBank {
	public static void main(String args[])
	{
		Bank b1=new Bank();
		HDFC h1=new HDFC();
		SBI sb=new SBI();
		ATMMachine am=new ATMMachine();
		
		am.atmDetails(h1);
	}

}
