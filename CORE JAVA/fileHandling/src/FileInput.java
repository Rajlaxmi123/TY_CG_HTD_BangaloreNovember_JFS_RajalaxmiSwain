import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream f1;
		try {
			f1 = new FileInputStream("anu.txt");
		
		
		int j=0;
		
			while((j= f1.read())!= -1)
			{
				System.out.println((char)j);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}	
		
		
		
	}


