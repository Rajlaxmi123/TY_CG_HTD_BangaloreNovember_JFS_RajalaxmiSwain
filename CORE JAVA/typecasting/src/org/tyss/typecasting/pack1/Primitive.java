package org.tyss.typecasting.pack1;

public class Primitive {
	//implicit typecasting
	byte b=4;
	short s=b;
	int c=b;
	float f=b;
	double d=b;
	void values()
	{
		System.out.println("byte value is"+b);
		System.out.println("short value is"+s);
		
		System.out.println("int value is"+c);
		
		System.out.println("float value is"+f);
		
		System.out.println("double value is"+d);
		
		
	}
	
	//explicit typecasting
	double pi=3.142;
	int i=(int)pi;
	void details()
	{
		System.out.println("typecasted value is"+i);
		
	}

}
