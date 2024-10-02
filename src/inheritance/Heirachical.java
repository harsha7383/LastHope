package inheritance;

class A1
{
	public void m1() 
	{
		System.out.println("m1 is calling");
	}
}
class B1
{
	public void m2() 
	{
		System.out.println("m2 is calling");
	}
}
class D1 extends A1
{
	public void m3() 
	{
		System.out.println("m3 is calling");
	}
}

public class Heirachical {

	public static void main(String[] args) 
	{
		A1 a1=new A1();
		a1.m1();
		///
		B1 b1=new B1();
		b1.m2();
		///
		D1 c1=new D1();
		c1.m1();
		c1.m3();
		
		
	}

}
