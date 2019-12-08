package com.cap.collection.TreeSet;

import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAge e1 = new EmployeeAge ();
		EmployeeNmae e2 = new EmployeeNmae();
		EmployeeSal e3 = new EmployeeSal();
		TreeSet<Employee> t1 = new TreeSet<Employee>(e1);
		t1.add(new Employee(87,"Rj",66000.0));
		
	
		t1.add(new Employee(27,"Rhggjj",70487.6));
		t1.add(new Employee(67,"Rkhujhj",65543.89));
	
		t1.add(new Employee(97,"Rlhjj",34546.89));
		
		
		
		for (Employee e4 :t1)
		{
			System.out.println("employee name is "+e4.name);
			System.out.println("Employee age is"+e4.age);
			System.out.println("Salary is" +e4.sal);
			System.out.println("-----------");
			
		}
		
	}

}
