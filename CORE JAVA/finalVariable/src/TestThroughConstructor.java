
public class TestThroughConstructor {

	public static void main(String[] args) {
		ThroughConstructor c1 = new ThroughConstructor(3.142);
		
		ThroughConstructor c2 = new ThroughConstructor(3.42,34);
		c1.details();
		c2.details();
		
		
	}

}
