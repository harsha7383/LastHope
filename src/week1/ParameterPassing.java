package week1;

public class ParameterPassing {
	
	//methoid without parameter
	public void add()
	{
	int a=19,b=18;
	System.out.println("The addition of two numbers is :"+(a+b));
	
	}
	//method with parameter
	public void sub(int a,int b)
	{
		System.out.println("The subtraction of two numbers is :"+(a-b));
	}
	
	//return method
	public int mult(int a,int b)
	{
		return(a*b);
	}
	
	
	public static void main(String[] args) {
		
		ParameterPassing p1=new ParameterPassing();
		p1.add();
		p1.sub(40,15);
		System.out.println("The multiplacatin of two numbers is :"+p1.mult(5, 5));
		//or
		int ret=p1.mult(10, 10);
		System.out.println("The multi is :"+ret);

	}

}
