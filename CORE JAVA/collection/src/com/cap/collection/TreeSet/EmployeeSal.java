package com.cap.collection.TreeSet;

import java.util.Comparator;

public class EmployeeSal implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.sal>o2.sal)
			{
				return 1;
			}
			else if(o1.sal<o2.sal)
			{
				return -1;
			}
			return 0;
		
	}

}
