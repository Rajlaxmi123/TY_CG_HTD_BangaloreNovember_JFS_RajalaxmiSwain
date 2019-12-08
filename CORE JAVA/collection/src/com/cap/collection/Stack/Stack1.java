package com.cap.collection.Stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s1 = new Stack();
s1.add(23);
s1.add(56);
s1.add(67);

s1.push(90);//added at last
System.out.println(s1);

s1.pop();  //remove the last

System.out.println(s1);
System.out.println(s1.peek());
System.out.println(s1);
System.out.println(s1.search(new Integer(23)));// it searches from reverse order i.e from last ...
//from last 23 is at 2nd position and thus it gives 2 as output
System.out.println(s1);










	}
	

}
