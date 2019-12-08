
public class Employee {
	String empName;
	double empSalary;
	int empAge;
	
	public Employee(String name,double salary,int age)
	{
		empName=name;
		empSalary=salary;
		empAge=age;
	}
	
	void details() {
		System.out.println("name"+empName+ " salary"+empSalary + "age"+empAge);
	}

}
