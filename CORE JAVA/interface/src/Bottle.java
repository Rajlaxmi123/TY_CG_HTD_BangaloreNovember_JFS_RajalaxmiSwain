
public interface Bottle {
	
	void open();
	void drink();
	default void juice()
	{
		System.out.println("juicing");
	}
	
	static void close()
	{
		System.out.println("close bottle");
		
	}
}
