
public class ThroughConstructor {
	final double PI;
	public ThroughConstructor(double PI)
	{
		this.PI =PI;
	}
	public ThroughConstructor(double PI,int a)
	{
		this.PI=PI;
	}
	void details() {
		System.out.println(PI);
	}
}
