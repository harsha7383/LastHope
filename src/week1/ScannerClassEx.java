package week1;

import java.util.Scanner;

public class ScannerClassEx {
	
	public void add(int a, int b)
	{
		System.out.println("Addition of two numbers is :"+(a+b));
		
	}

	public static void main(String[] args) 
	{
		ScannerClassEx r1=new ScannerClassEx();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number");
		int num2=sc.nextInt();
		r1.add(num1, num2);
		
	}

}
