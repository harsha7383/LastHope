package conditionalStatements;

import java.util.Scanner;

public class IFelse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		
		//conditional
		if(age>=18)
		{
			System.out.println("Age is Valid");
		}else
		{
			System.out.println("Age is not Valid");
			
		}
		sc.close();

	}

}
