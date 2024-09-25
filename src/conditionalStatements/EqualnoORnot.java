package conditionalStatements;

import java.util.Scanner;

public class EqualnoORnot {

	public static void main(String[] args) 
	{
		//int a=10,b=50,c=100;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter One number");
		int o1=sc.nextInt();
		
		if(o1==10)
		{
			System.out.println(o1+" is a equal number ");
		}
		else if (o1==50)
		{
			System.out.println(o1+" is a equal number");
		}
		else if (o1==100)
		{
			System.out.println(o1+" is a equal number");
		}
		else
		{
			System.out.println("the number is not equal to 10 or 50 or 100");
		}
		sc.close();

	}

}
