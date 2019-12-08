import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collection c1=new ArrayList();

		//adding an element inside the collection.
		c1.add("Hi");
	 c1.add("raj");
	 c1.add("hbbjnj");
	 c1.add(" kjfh");
	 
		System.out.println(c1);

		//removing an element from the collection
		c1.remove("Hi");
		System.out.println(c1);

		//finding the size
		System.out.println(c1.size());

		//checking that collection is empty or not
		System.out.println(c1.isEmpty());
		c1.add("kam");

		//checking whether Hi object is there or not inside the collection
		System.out.println(c1.contains("Hi"));
		System.out.println(c1.contains(" kjfh"));


		
		
		
		
		
		
	}

}
