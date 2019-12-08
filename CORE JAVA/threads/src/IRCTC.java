
public class IRCTC {


	synchronized void confirmTicket()
	{
		for(int i=0; i < 4 ; i++)
		{
			System.out.println(i);

			//			try {
			//				Thread.sleep(500);
			//			} catch (InterruptedException e) {
			//				// TODO Auto-generated catch block
			//				System.out.println(e.getMessage());
			//			}

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}

	}

	synchronized void leaveMe() {
		// TODO Auto-generated method stub
		System.out.println("notify called");
		notifyAll();
	}

}
