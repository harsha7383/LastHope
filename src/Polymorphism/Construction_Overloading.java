package Polymorphism;

public class Construction_Overloading 
{
	public Construction_Overloading ()
	{
		System.out.println("This is Compile Time Parameter");
	}
	public Construction_Overloading (int id)
	{
	System.out.println("This is Parametarized Constructor "+id);
	}
	public Construction_Overloading (int id,String name)
	{
	System.out.println("This is Parametarized Constructor "+id+" name is "+name);
	}
	public Construction_Overloading (String name,int id)
	{
	System.out.println("This is Parametarized Constructor "+name+" id is "+id);
	}
	public Construction_Overloading (String name)
	{
	System.out.println("This is Parametarized Constructor  "+name);
	}

	public static void main(String[] args) 
	{
		Construction_Overloading c1=new Construction_Overloading();
		Construction_Overloading c2=new Construction_Overloading(100);
		Construction_Overloading c3=new Construction_Overloading(200,"Harsha");
		Construction_Overloading c4=new Construction_Overloading("Vardhan",300);
		Construction_Overloading c5=new Construction_Overloading("naidu");

	}

}
