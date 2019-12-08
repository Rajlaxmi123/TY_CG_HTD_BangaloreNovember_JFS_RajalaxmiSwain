package com.cap.collection.Vector;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v1 = new Vector();

v1.add(12);
v1.add(13);
v1.add(24);
v1.add(35);


System.out.println(v1);

System.out.println("------remove-------------");
v1.remove(new Integer(24));
System.out.println(v1);

System.out.println("--------set---------------");
v1.set(1, 1);
System.out.println(v1);

System.out.println("-------for loop---------");
for(int i=0;i<v1.size();i++)
{
	System.out.println(v1.get(i));
}
	}

}
