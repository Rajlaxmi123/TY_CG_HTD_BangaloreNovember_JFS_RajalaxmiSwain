package com.cap.collection.TreeSet;

public class Employee implements Comparable<Employee> {
 int age;
 String name;
 Double sal;
 
	public Employee(int age, String name, Double sal) {
	super();
	this.age = age;
	this.name = name;
	this.sal = sal;
}
	

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", sal=" + sal + "]";
	}


	//@Override
	//public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//if(this.age>o.age)
		//{
		//	return 1;
		//}
		//else if(this.age<o.age)
		//{
		//	return -1;
		//}
		//return 0;
	//}
	
	
	//@Override
	//public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//if(this.sal>o.sal)
		//{
		//	return 1;
		//}
		//else if(this.sal<o.sal)
		//{
		//	return -1;
		//}
		//return 0;
	//}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return o.name.compareTo(this.name);
	}

}
