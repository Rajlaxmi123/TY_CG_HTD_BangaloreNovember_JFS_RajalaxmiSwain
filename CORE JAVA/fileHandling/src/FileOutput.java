import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream f1 = new FileOutputStream("Anu.txt");
			String s1 = " Divya BOGAR";
			byte b1[]= s1.getBytes();
			
			f1.write(b1);
			
			System.out.println("sucessss....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
