package week1;

public class Calculator {
	
	public int add(int a,int b)
	{
		return (a+b);
	}
	
	public int sub (int a,int b)
	{
		return (a-b);
	}
	public int div (int a,int b)
	{
		return (a/b);
	}
	public int mul (int a,int b)
	{
		return (a*b);
	}


	public static void main(String[] args) {
		
		Calculator c1=new Calculator();
		System.out.println("Addition of two numbers is :"+c1.add(10, 10));
		System.out.println("Sunstraction of two numbers is :"+c1.sub(40, 15));
		System.out.println("division of two numbers is :"+c1.div(5, 5));
		System.out.println("Multiplication of two numbers is :"+c1.mul(6, 6));
		//or it is another type
		int ad=c1.add(15, 20);
		System.out.println("Addition is :"+ad);

	}

}
