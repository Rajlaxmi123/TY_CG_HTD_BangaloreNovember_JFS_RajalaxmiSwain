package com.caps.queue.ArrayDeque;

import java.util.PriorityQueue;

public class ArrayDeque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Student> p1 = new PriorityQueue<Student>();

p1.offer(new Student(23,"div"));
p1.offer(new Student(24,"shree"));
p1.offer(new Student(24,"divya"));

for (Object o1 : p1) {
	System.out.println(o1);
}
	}

}
