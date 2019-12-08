import java.util.ArrayList;
import java .util.*;
public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collection c1=new ArrayList();

//adding an element inside the collection.
c1.add(12);
System.out.println(c1);

//removing an element from the collection
c1.remove(12);
System.out.println(c1);

//finding the size
System.out.println(c1.size());

//checking that collection is empty or not
System.out.println(c1.isEmpty());
c1.add(12);

//checking whether 12 object is there or not inside the collection
System.out.println(c1.contains(12));





	}

}
