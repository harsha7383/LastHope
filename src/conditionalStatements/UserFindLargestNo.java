package conditionalStatements;

import java.util.Scanner;

public class UserFindLargestNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Different Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		 
		if(a>b && a>c)
		{
			System.out.println(a+" is greatest number "+b+ " & "+c);
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is greatest number "+a+ " & "+c);
		}
		else

		{
			System.out.println(c+" is greatest number "+a+ " & "+b);
		}
		sc.close();
	}

}
