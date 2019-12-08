package com.cap.map.TreeMap;

import java.util.Comparator;

public class SortingAge implements Comparator<SortingAge> {
 int age;
 
	public SortingAge(int age) {
	super();
	this.age = age;
}

	@Override
	public int compare(SortingAge o1, SortingAge o2) {
		if (o1.age >o2.age)
		{
			return 1;
		}else if (o1.age < o2.age)
		{ return -1;
		
		}else
			return 0;
	}

}
