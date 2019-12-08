package com.cap.encapsulation.JavaBeanClass;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p1 = new Person();

p1.setAge(23);
p1.setName("john");

System.out.println(" AGe is " +p1.getAge() + " name is" +p1.getName());
	}

}
