package com.cap.collection.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Student> t1 = new TreeSet<Student>();
		t1.add(new Student(87,"Rj"));
		
	
		t1.add(new Student(27,"Rhggjj"));
		t1.add(new Student(67,"Rkhujhj"));
	
		t1.add(new Student(97,"Rlhjj"));
		
		
		Iterator itr = t1.iterator();
				while(itr.hasNext())
				{
			   System.out.println(itr.next());
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
