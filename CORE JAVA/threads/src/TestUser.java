
public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		PVR p = new PVR();
		User u1 = new User(p);//user here acts as thread since it extends thread class
		u1.start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {		// TODO Auto-generated catch block
			System.out.println(e.getMessage());		
		}
		p.leaveMe();
		System.out.println("main started");






	}

}
