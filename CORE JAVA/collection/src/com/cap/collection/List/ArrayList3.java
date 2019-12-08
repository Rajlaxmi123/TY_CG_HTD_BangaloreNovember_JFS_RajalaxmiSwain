package com.cap.collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(6.5);
		a1.add(5.5);
		a1.add(8.5);
		 System.out.println(a1);
		 a1.remove(a1);
		 System.out.println(a1);
		 
		 System.out.println("-------------for loop ------------");
		 
		 //iterating an arraylist using for loop
		 
		 for(int i=0; i<a1.size() ; i++)
		 {
			 System.out.println(a1.get(i));
		 }
		 
		 
		 //for-each loop
		 for( Double i1: a1)
		 {
			 System.out.println(i1);
		 }
		 
	 
		 System.out.println("-------iterator method--------");
		 
		 
		 
		 Iterator<Double> itr =  a1.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 
		 
 System.out.println("-------listiterator method--------");
		 
		 
		 ListIterator<Double> itr1 =  a1.listIterator();
		 
		 
		 while(itr1.hasNext())
		 {
			 System.out.println(itr1.next());
		 }
		 
		 
		 while(itr1.hasPrevious())
		 {
			 System.out.println(itr1.previous());
		 }
		
		 
		 
		 
ArrayList<Double> a2 = new ArrayList<Double>();
a2.add(8.9);
a2.add(9.0);
a2.add(7.5);
a2.add(9.0);


System.out.println(a2);



		
		
			
		
		
		
		
		
		
		
		
	}

}
