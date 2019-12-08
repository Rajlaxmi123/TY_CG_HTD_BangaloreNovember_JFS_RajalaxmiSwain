package com.cap.map.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String,Integer> l1 = new LinkedHashMap<String,Integer>();
		l1.put("BTM", 67900);
		l1.put("RAJA", 679001);
		l1.put("OAR", 679002);
		l1.put("OAR", null);
		l1.put(null , 67900900);
		l1.put("OAR", 679002);
		
		
		
		
		
		l1.remove("BTM", 67900);
		System.out.println(l1);
		
		Set<Entry<String, Integer>> s1 = l1.entrySet();
		
		for(Map.Entry<String, Integer>e1 : s1 )
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
		}
		
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		System.out.println(l1.containsKey(67900));
		System.out.println(l1.containsValue("OAR"));
		System.out.println(l1.values());
		System.out.println(l1.keySet());
		
		
		
		
	}

}
