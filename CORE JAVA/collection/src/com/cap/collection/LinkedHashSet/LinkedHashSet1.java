package com.cap.collection.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet l1 = new LinkedHashSet();
l1.add(12);
l1.add(44);
l1.add(64);
l1.add(44);
l1.add(null);

Iterator itr = l1.iterator();
 while(itr.hasNext())
 {
	 System.out.println(itr.next());
 }
 
 LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
 l1.add(12);
 l1.add(44);
 l1.add(64);
 l1.add(44);
 l1.add(null);

 Iterator itr1 = l1.iterator();
  while(itr1.hasNext())
  {
 	 System.out.println(itr1.next());
  }
 
  LinkedHashSet<String> l3 = new LinkedHashSet();
  l1.add("raj");
  l1.add("khv");
  l1.add("gff");
  l1.add("raj");
  l1.add(null);

  Iterator itr2 = l1.iterator();
   while(itr2.hasNext())
   {
  	 System.out.println(itr2.next());
   }
  
 

	}

}
