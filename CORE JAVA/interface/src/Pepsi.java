
public class Pepsi implements Bottle {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Open pepsi");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Drinking pepsi");
	}
	
	public void juice()
	{
		System.out.println(" juice overrided");
	}

}
