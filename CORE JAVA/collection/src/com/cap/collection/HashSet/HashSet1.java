package com.cap.collection.HashSet;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for non-generic type
		HashSet hs = new HashSet();
		hs.add(23);
		hs.add(86);
		hs.add(12);
		hs.add(44);
		hs.add(44);//adding duplicate values
		hs.add(null);//it will work in non generic type

		for( Object o : hs)
		{
			System.out.println(o);
		}

		//for generic type
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(23);
		h1.add(86);
		h1.add(12);
		h1.add(44);

		for( Integer object  : h1)
		{
			System.out.println(object.hashCode());
			System.out.println(object);
		}


		
		HashSet<String> h2 = new HashSet<String>();
		h2.add("sush");
		h2.add("sweta");
		h2.add("pooja");
		h2.add("rajlaxmi");
		//h2.add(null);//give exception
		
		
		for( String object  : h2)
		{
			System.out.println(object.hashCode());
			System.out.println(object);
		}

		
		
		
		
		
		
		
		
	}

}
