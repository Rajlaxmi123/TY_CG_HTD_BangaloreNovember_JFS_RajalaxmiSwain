package com.cap.map.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> t1 = new TreeMap<Integer,String>();

t1.put(45, "divya");
t1.put(45, "anu");
t1.put(45, "Shree");


Set<Map.Entry<Integer,String>>s1 =t1.entrySet();

for(Map.Entry<Integer, String> e1 : s1)
{
	System.out.println(e1.getValue());
	System.out.println(e1.getKey());
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
