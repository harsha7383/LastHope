package week1;

public class StaticBlockDemo {
	int id;
	String name;
	static String cname;
	
	static
	{
		System.out.println("Static block is calling***");
		cname="naidu college";
	}
	
	public StaticBlockDemo(int id,String name)
	{
		System.out.println("Constructor is calling***");
		this.id=id;
		this.name=name;
	}
	
	public void harry()
	{
		System.out.println("Method is calling yaar***");
		System.out.println("Student id is : "+id);
		System.out.println("Student name is : "+name);
		System.out.println("Student college name is : "+cname);
	}

	public static void main(String[] args) {
		
		System.out.println("Main is Caliing**");
		
		StaticBlockDemo s1=new StaticBlockDemo(118,"Potter");
		s1.harry();
		

	}

}
