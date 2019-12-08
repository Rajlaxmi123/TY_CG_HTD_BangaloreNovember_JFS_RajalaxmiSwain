package com.cap.collection.LinkedList;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 =  new LinkedList();
		
		l1.add(23);
		l1.add(56);
		l1.add(64);
		l1.add(85);
		
		System.out.println("--------all these methods are present inside deque interface that is implemneted to linkedlist_______");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		
		System.out.println(l1);
		//poll first and poll last
		
		System.out.println("--------------pole,plefirst,polelast-----------");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
		//offer, offer first,offerlast
		
		System.out.println("-----------offer,offerlst,offerfirst-----------------");
		LinkedList l2 =  new LinkedList();
		l2.offer(8);
		System.out.println(l2);
		l2.offerFirst(2);
		System.out.println(l2);
		l2.offerLast(45);
		System.out.println(l2);
		
		
		
		
		
	}

}
