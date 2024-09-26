package conditionalStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int nu=sc.nextInt();
		
		
		switch (nu)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
				System.out.println("Please Enter a Valid Number");
			sc.close();
		}
		

	}

}
