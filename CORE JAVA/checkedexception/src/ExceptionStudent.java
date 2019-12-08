
public class ExceptionStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main started");

		Student s1=new Student();
		try {
		Class c1 = Class.forName("Student");
		Object o1= s1.clone();
		System.out.println("object is cloned");
	}catch(CloneNotSupportedException e){
		System.out.println("clone not suupported");
	}catch(ClassNotFoundException c)
	{
		System.out.println("class not found");
	}
	
		
		
		
		System.out.println("main ended");
		
		
		
		
		
	}

}
