import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(12);
		a1.add(35);
		a1.add(38);
		 System.out.println(a1);
		 a1.remove(a1);
		 System.out.println(a1);
		 
		 System.out.println("-------------for loop ------------");
		 
		 //iteratin an arraylist using for loop
		 
		 for(int i=0; i<a1.size() ; i++)
		 {
			 System.out.println(a1.get(i));
		 }
		 
		 
		 //for-each loop
		 for( Integer i1: a1)
		 {
			 System.out.println(i1);
		 }
		 
	 
		 System.out.println("-------iterator method--------");
		 
		 
		 
		 Iterator<Integer> itr =  a1.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 
		 
 System.out.println("-------listiterator method--------");
		 
		 
		 ListIterator<Integer> itr1 =  a1.listIterator();
		 
		 
		 while(itr1.hasNext())
		 {
			 System.out.println(itr1.next());
		 }
		 
		 
		 while(itr1.hasPrevious())
		 {
			 System.out.println(itr1.previous());
		 }
		
		 
		 
		 
ArrayList<Integer> a2 = new ArrayList<Integer>();
a2.add(23);
a2.add(24);

System.out.println(a2);


a2.remove(new Integer(23));
System.out.println(a2);









		
		
		
	}

}
