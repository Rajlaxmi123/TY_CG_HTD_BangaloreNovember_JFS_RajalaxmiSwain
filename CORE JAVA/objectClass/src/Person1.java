
public class Person1{
	String name;

	
	public Person1(String name) {
		// TODO Auto-generated constructor stub
	 this.name = name;
	}
	
	
	 
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	public static void main(String args[]) throws Throwable
	{
		Person1 p1=new Person1("john");
		p1.finalize();
	}
	
}

