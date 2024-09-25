package conditionalStatements;

import java.util.Scanner;

public class AeiouExample {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch=sc.nextLine().charAt(0);
		
		if(ch=='a')
		{
			System.out.println(ch+" is a vowel");
		}
		else if (ch=='e')
		{
			System.out.println(ch+"is a vovel");
		}
		else if (ch=='i')
		{
			System.out.println(ch+" is a vovel");
		}
		else if (ch=='o')
		{
			System.out.println(ch+" is a vovel");
		}
		else if (ch=='u')
		{
			System.out.println(ch+" is a vovel");
		}
		else
		{
			System.out.println(ch+" is not a vowel");
		}
		sc.close();

	}

}
