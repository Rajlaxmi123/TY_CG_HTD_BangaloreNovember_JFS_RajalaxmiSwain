import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("hi");
		a1.add("bye");
		a1.add("kor");
		 System.out.println(a1);
		 a1.remove(a1);
		 System.out.println(a1);
		 
		 System.out.println("-------------for loop ------------");
		 
		 //iterating an arraylist using for loop
		 
		 for(int i=0; i<a1.size() ; i++)
		 {
			 System.out.println(a1.get(i));
		 }
		 
		 
		 //for-each loop
		 for( String i1: a1)
		 {
			 System.out.println(i1);
		 }
		 
	 
		 System.out.println("-------iterator method--------");
		 
		 
		 
		 Iterator<String> itr =  a1.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 
		 
 System.out.println("-------listiterator method--------");
		 
		 
		 ListIterator<String> itr1 =  a1.listIterator();
		 
		 
		 while(itr1.hasNext())
		 {
			 System.out.println(itr1.next());
		 }
		 
		 
		 while(itr1.hasPrevious())
		 {
			 System.out.println(itr1.previous());
		 }
		
		 
		 
		 
ArrayList<String> a2 = new ArrayList<String>();
a2.add("no");
a2.add("hello");
a2.add("hello");
a2.add("khgf");


System.out.println(a2);


a2.remove(new String("khgf"));
System.out.println(a2);
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
