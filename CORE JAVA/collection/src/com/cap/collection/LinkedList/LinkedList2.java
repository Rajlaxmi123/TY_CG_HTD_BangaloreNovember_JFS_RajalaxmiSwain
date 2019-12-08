package com.cap.collection.LinkedList;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 =  new LinkedList();
		l1.add(23);
		l1.add(65);
		System.out.println(l1);
		
		
		System.out.println("-------all these are present inside list that are implemented to linkedlist class ---------");
		//addfirst()
		l1.addFirst(45);
		System.out.println(l1);
		
		//addlast()
		l1.addLast(89);
		System.out.println(l1);
		
		
		
		//remove() method is similar to remove first ---it will remove the first element
		l1.remove();
		System.out.println(l1);
		
		//remove first
		l1.removeFirst();
		System.out.println(l1);
		
		//remove last
		l1.removeLast();
		System.out.println(l1);
		
		LinkedList l2 =  new LinkedList();
		l2.add(23);
		l2.add(45);
		l2.add(45);
		l2.add(46);
		l2.add(82);
		
		System.out.println(l2);
		
		
		l2.removeFirstOccurrence(45);
		System.out.println(l2);
		l2.removeLastOccurrence(45);
		System.out.println(l2);
		
		//get first and last
		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
