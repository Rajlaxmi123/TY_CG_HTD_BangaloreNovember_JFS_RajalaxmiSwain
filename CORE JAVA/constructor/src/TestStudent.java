
public class TestStudent {
	public static void main(String args[])
	{
		Student s1=new Student();
		System.out.println("name "+s1.name);
		System.out.println("Age "+s1.age);
		
		Student s2=new Student("john",23);
		System.out.println("name "+s2.name);
		System.out.println("Age "+s2.age);
		
		
	}

}
