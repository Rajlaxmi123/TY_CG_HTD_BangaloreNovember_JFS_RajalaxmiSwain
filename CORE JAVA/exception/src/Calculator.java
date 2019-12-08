
public class Calculator {
void divide(int a,int b)
{
	System.out.println("divide method called");
	try {
	System.out.println(a/b);
	}catch(ArithmeticException e) {
		System.out.println("dont divde by 0");
	}
	System.out.println("divided");
}
}
