package inheritance;

class A
{
	public void m1()
	{
		System.out.println("m1 is calling");
	}
}
class B extends A
{
	public void m2()
	{
		System.out.println("m2 is calling");
	}
}
class C extends B
{
	public void m3()
	{
		System.out.println("m3 is calling");
	}
}

public class Multilevel {

	public static void main(String[] args) 
	{
		A a1=new A();
		a1.m1();
		///
		B b1=new B();
		b1.m1();
		b1.m2();
		///
		C c1=new C();
		c1.m1();
		c1.m2();
		c1.m3();

	}

}
