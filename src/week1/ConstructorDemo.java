package week1;

public class ConstructorDemo {
	
	int id=100;
	String name="harsha";
	
	public ConstructorDemo()
	{
		System.out.println("This is DEfault Constructor*****");
		System.out.println("Default Constructor is :"+id);
		System.out.println("Default constructor is :"+name);
		
	}
	public ConstructorDemo(int i,String n)
	{
		id=i;
		name=n;
		System.out.println("This is Parametarized Constructor*****");
		System.out.println("Parametarized Constructor is :"+id);
		System.out.println("Parametarized constructor is :"+name);
	}

	public static void main(String[] args) {
		
		ConstructorDemo c1=new ConstructorDemo();
		ConstructorDemo c2=new ConstructorDemo(200,"Vardhan");
					
		

	}

}
