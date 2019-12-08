
public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main started");
int a1[]=new int[2];

a1[0]=1;
a1[1]=2;
try {
a1[2]=3;
}catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("there is no size to store data");
}
System.out.println("main ended");
	
	}
}
