package com.tyss.accessspecifier.pack2;
import com.tyss.accessspecifier.pack1.*;

public class TestStudent extends Student {
	
	protected TestStudent( String name)
	{  
		super(name);
	
		
	}
	void studentDetails()
	{
		System.out.println("name"+studName);
	}
	
	
	public static void main(String args[])
	{
		Student s1=new Student("john");
		s1.studentDetails();
		
				
	}

}
