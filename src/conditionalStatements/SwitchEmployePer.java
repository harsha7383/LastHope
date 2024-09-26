package conditionalStatements;

import java.util.Scanner;

public class SwitchEmployePer {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Performance Number");
		int per=sc.nextInt();
		
		switch (per) {
		case 1:
			System.out.println("Poor Performance");
			break;
		case 2:
			System.out.println("Need to Improve");
			break;
		case 3:
			System.out.println("Good Performance");
			break;
		case 4:
			System.out.println("Excellent Performance");
			break;
		case 5:
			System.out.println("Employee of the Year");
			break;

		default:
			System.out.println("Enter valid Performance Number");
			break;
		}
		sc.close();
		
		
		
	}

}
