
public class TestCalculator {
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
		int r1=c1.add(25);
		int r2=c1.add(2, 3);
		double r3=c1.add(13.5);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		Calculator.multiply(11);
		Calculator.multiply(3, 4);
		Calculator.multiply(13.5);
	}
	

}
