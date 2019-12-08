
public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main started");
		Thread1 t1  = new Thread1();
		t1.start();//if we call the start method,it automatically calls run()
		System.out.println("mAIN ENDED");
	}

}
