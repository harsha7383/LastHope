package Polymorphism;

class B extends A
{
	@Override
	
	public void colour() 
	{
		System.out.println("yellow");
	}
}

public class Run_Colour {

	public static void main(String[] args) 
	{
		B b1=new B();
		b1.colour();
		
		A a1=new A();
		a1.colour();
		
		

	}

}
