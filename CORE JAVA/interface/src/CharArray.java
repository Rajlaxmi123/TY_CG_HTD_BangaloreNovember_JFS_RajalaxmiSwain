
public class CharArray {
	public static void main(String[] args)
	{
		char[] c1 = new char[4];
		c1[0]='h';

		c1[2]=900;
		c1[3]='b';
		
		for(int i=0;i<c1.length;i++)
		{
			System.out.println(c1[i]);
		}
	}

}
