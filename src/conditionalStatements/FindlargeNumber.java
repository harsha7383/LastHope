package conditionalStatements;

import java.util.Scanner;

public class FindlargeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int nu1=sc.nextInt();
		int nu2=sc.nextInt();
		
		if(nu1>nu2)
		{
			System.out.println(nu1+" is the largest number compared to "+nu2);
		}
		else
		{
			System.out.println(nu2+" is the largest number compared to "+nu1);
		}
		sc.close();
		
		
	}

}
