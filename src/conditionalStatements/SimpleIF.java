package conditionalStatements;

import java.util.Scanner;

public class SimpleIF {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		
		//condition
		if(age>=18)
		{
			System.out.println("User Age is valid");
		}
		sc.close();
		

	}

}
