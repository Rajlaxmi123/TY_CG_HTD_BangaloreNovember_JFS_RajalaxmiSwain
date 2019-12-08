package com.cap.map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,Employee> l1 = new LinkedHashMap<Integer,Employee>();
		
		l1.put(45, new Employee(45,"hi",890.99));
		l1.put(46, new Employee(45,"hi",890.99));
		l1.put(47, new Employee(45,"hi",890.99));
		l1.put(48, new Employee(45,"hi",890.99));
		l1.put(49, new Employee(45,"hi",890.99));
		
		
		System.out.println(l1.get(45));
		
	Set<Entry<Integer, Employee>> s1 =	l1.entrySet();
		
		for(Map.Entry<Integer, Employee> e1 : s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-------------------------");
		}
		
		System.out.println(l1.containsKey(45));
		System.out.println(l1.containsValue(new Employee(45,"hi",890.99)));
		
		
	}

}
