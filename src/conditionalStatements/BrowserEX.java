package conditionalStatements;

import java.util.Scanner;

public class BrowserEX {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser Name ");
		String bname=sc.nextLine();
		
		if(bname.equalsIgnoreCase("Google"))
		{
			System.out.println("Test case is executing in Google");
		}
		else if (bname.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Test case is executing in Chrome");
		}
		else if (bname.equalsIgnoreCase("Firefox"))
		{
			System.out.println("Test case is executing in Firefox");
		}
		else if (bname.equalsIgnoreCase("Edge"))
		{
			System.out.println("Test case is executing in Edge");
		}
		else
		{
			System.out.println("Please provide Valid Browser Name");
		}
		sc.close();

	}

}
