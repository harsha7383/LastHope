package Polymorphism;

public class CompileTimePoly 
{
	public void add()
	{
		int a=20,b=10;
		System.out.println("Adittion is :"+(a+b));
	}
	public void add(int a,int b)
	{
		System.out.println("Adittion is :"+(a+b));
	}
	public void add(int a ,int b,int c)
	{
		System.out.println("Adittion is :"+(a+b+c));
	}
	public void add(double a,int b)
	{
		System.out.println("Adittion is :"+(a+b));
	}
	public void add(int a,double b)
	{
		System.out.println("Adittion is :"+(a+b));
	}
	

	public static void main(String[] args) 
	{
		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(20, 35);
		c1.add(10, 15,10);
		c1.add(20.11,10);
		c1.add(50,50.10);

	}

}
