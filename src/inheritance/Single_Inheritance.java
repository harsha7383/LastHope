package inheritance;


class x
{
	public void m1()
	{
		System.out.println("M1 is calling!");
	}
}
class y extends x
{
	public void m2()
	{
		System.out.println(" M2 is calling!");
	}
}


public class Single_Inheritance {

	public static void main(String[] args) 
	{
		x x1=new x();
		x1.m1();
		
		y y1=new y();
		y1.m1();
		y1.m2();
		
		
	}

}
