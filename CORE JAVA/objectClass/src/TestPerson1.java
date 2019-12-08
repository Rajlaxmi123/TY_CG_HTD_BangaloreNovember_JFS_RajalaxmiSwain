
public class TestPerson1 extends Person1{
	
		public TestPerson1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

		public static void main(String args[]) throws Throwable
		{
			System.out.println("main started");
			Person1 p1=new Person1("john");
			p1.finalize();
		
			TestPerson1 p3=new TestPerson1("john");
			p3.finalize();
			p1=null;
			System.gc();
			System.out.println("main ended");
			
			
			
			
			
			
			
		}

	


}
