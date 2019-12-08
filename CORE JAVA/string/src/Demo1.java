
public class Demo1 {
	public static void main(String args[])
	{
		String s1=new String("john");
		System.out.println(s1.hashCode());
	
		String s2=new String("mike");
		String s4=new String("john");
		s1=new String("divya");
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s2.hashCode());
		
	
	}
	

}
