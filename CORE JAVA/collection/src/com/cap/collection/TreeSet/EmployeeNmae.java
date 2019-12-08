package com.cap.collection.TreeSet;

import java.util.Comparator;

public class EmployeeNmae implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o1.name.compareTo(o2.name);
		
	}
	
	
	
	

}
