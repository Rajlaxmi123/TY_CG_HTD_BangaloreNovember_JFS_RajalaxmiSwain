
public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("start");
try {
System.out.println(10/0);
}catch(ArithmeticException a)
{
	System.out.println("dont deal with 0");
}finally
{
	System.out.println("finally block called");
}
System.out.println("end");
	}

}
