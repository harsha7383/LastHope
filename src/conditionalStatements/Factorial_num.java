package conditionalStatements;

public class Factorial_num {

	public static void main(String[] args)
	{
		int num=5;
		int factorial=1;
		for(int i=1;i<=num;i++)
		{
			factorial*=i;
		}
		System.out.println("The Factorial of "+num+" is "+factorial);
	}

}
