
public class EXceptionA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main started");
try
{
	Class c1= Class.forName("Person");
	System.out.println("class is found");
	
	}catch(ClassNotFoundException e)
{
		System.out.println("class is not found");
}
System.out.println("main ended");

}
}

