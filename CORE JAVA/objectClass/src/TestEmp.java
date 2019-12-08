
public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp e1=new Emp(23,"hi");
Emp e2=new Emp(23,"hi");
Emp e3=new Emp(23,"hiiii");

System.out.println(e1.equals(e2));
System.out.println(e1.hashCode());
System.out.println(e2.hashCode());
System.out.println(e3.hashCode());


	}

}
