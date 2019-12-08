
public class InstanceBlock {
	final int max;
	static final double PI;
	public InstanceBlock()
	{
		System.out.println("constructor is called");
	}
	public InstanceBlock(int a)
	{
		System.out.println("constructor overloaded");
	}
	{
		System.out.println("Initialiser block executed");
		this.max = 3000;
	}
	
	static {
		System.out.println("Static block initialiser");
		PI =3.142;
	}

}
