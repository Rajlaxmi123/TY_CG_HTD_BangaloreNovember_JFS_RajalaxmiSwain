import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		
		c.add(23);
		c.add(34);
		
		Collection c1=new ArrayList();
		
	c1.add(45);
	c1.add(67);
	
	c.addAll(c1);
	System.out.println(c);
	
	
	Collection c2=new ArrayList();
	c2.add(12);
	c2.add(23);
	c2.add(25);
	
	Collection c3=new ArrayList();
	c3.add(34);
	c3.add(45);
	c3.add(25);
	c3.add(25);
	
	c2.addAll(c3);
	
	System.out.println(c2);
	System.out.println("-------------------");
	
	
	c2.removeAll(c3);
	System.out.println(c2);
	
	System.out.println("-------------------");
	Collection c4=new ArrayList();
	c4.add(25);
	c4.add(23);
	c4.add(86);
	c4.add(98);
	
	
	
	Collection c5=new ArrayList();
	c5.add(25);
	c5.add(23);
	c5.add(12);
	c5.add(13);
	
	c4.retainAll(c5);
	System.out.println(c4);
	
	System.out.println("-------------------");
	
	Collection c6=new ArrayList();
	c6.add(12);
	c6.add(23);
	
	Object a[]= c6.toArray();
	for(int i=0;i < a.length ; i++)
	{
		System.out.println(a[i]);
	}
	
	
	
	
	
	

	
	
	c4.clear();
	System.out.println(c4);
	
	
	
	
	
	
	
	}

}
