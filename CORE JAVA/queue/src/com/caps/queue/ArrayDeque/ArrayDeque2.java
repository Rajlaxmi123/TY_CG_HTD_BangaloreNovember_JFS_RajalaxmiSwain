package com.caps.queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<String> a1 = new ArrayDeque<String>();

a1.add("hi");
a1.add("bye");
a1.addFirst("lou");
a1.add("vin");
a1.add("aqu");
a1.addLast("koyal");

Iterator itr =a1.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}

System.out.println(a1.getFirst());
System.out.println(a1.getLast());

a1.remove();
System.out.println(a1);

a1.removeFirst();
System.out.println(a1);

a1.removeLast();
System.out.println(a1);


a1.addFirst("lou");
a1.add("vin");
a1.add("aqu");
a1.addLast("koyal");


a1.removeFirstOccurrence("lou");
a1.removeLastOccurrence("koyal");


a1.peek();
a1.peekFirst();
a1.peekLast();

System.out.println(a1);






	}

}
