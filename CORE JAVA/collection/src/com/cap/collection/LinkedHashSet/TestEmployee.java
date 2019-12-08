package com.cap.collection.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Employee> l1 = new LinkedHashSet<Employee>();
		l1.add(new Employee(22,"Raj"));
		l1.add(new Employee(23,"ramu"));
		l1.add(new Employee(22,"Raj"));
		
		
		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
