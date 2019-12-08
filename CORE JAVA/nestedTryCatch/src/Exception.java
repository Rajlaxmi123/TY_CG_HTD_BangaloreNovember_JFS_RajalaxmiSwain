
public class Exception {
	void exception1(int a,String b)
	{
		try {
		System.out.println(10/0);
		
		try {
		System.out.println(500/a);
	}catch(ArithmeticException a1)
		{
		System.out.println("Dont deal with 0");
		}
		}catch(NullPointerException b1)
		{
			System.out.println("Dont deal with null");
		}
	}
	}

