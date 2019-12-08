package com.cap.checkedexception.Nestedtry;

public class ExceptionEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main started");
		
		Employee e1 = new Employee();
		
		try {
			
			Object o1 = e1.clone();
			 try {
				  Class c1 = Class.forName("Nestedtry.Employee");
				  
			 }catch(ClassNotFoundException  c)
			 {
				 System.out.println(" class not found");
			 }
			
			System.out.println("class is found");
			
		}catch(CloneNotSupportedException e)
		{
			System.out.println("clone not found");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
