
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="john";
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
System.out.println(s1.length());


String s2=" John Mikel ";
System.out.println(s2.trim());
String s5="sudhanshu";
System.out.println(s5.substring(3, 6));
System.out.println(s5.isEmpty());
String s6="SheeShanti";
System.out.println(s6.charAt(4));
System.out.println(s6.indexOf('h'));

System.out.println(s6.indexOf("he"));
System.out.println(s6.indexOf("hee", 2));
System.out.println(s6.indexOf('h', 4));
System.out.println(s6.lastIndexOf(4));


System.out.println(s6.concat("hi"));
System.out.println( s1.equalsIgnoreCase("john"));
System.out.println( s1.equalsIgnoreCase("tixe")); 

System.out.println( s1.replace('h', 'X') );


System.out.println( s1 + "x" ); // result is" hi x"
System.out.println(s1.trim() + "x");






		
		
		
		
		
	}

}
