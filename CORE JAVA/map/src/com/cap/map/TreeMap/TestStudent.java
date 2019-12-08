package com.cap.map.TreeMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortingAge s2 = new SortingAge(24);
TreeMap<Student,String> t1= new TreeMap<Student,String>();

t1.put(new Student(24,"raj"), "1st Standard");
t1.put(new Student(27,"ram"), "2nd Standard");
t1.put(new Student(26,"raghav"), "3rd Standard");



 Set<Entry<Student, String>> s1 = t1.entrySet();
for (Map.Entry<Student, String> e1 : s1)
{
	System.out.println(e1.getValue());
	System.out.println(e1.getKey());
}

System.out.println(t1.get(new Student(24,"raj")));

	}

}
