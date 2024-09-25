package week1;

import java.util.Scanner;

public class ScannerAssignment {
	
	//add method
	public void add(int a,int b)
	{
		System.out.println("ADD the Two Numbers : "+(a+b));
	}
	//sub
	public void sub(int a,int b)
	{
		System.out.println("sub the Two Numbers : "+(a-b));
	}
	
	//multi
	public void mul(int a,int b)
	{
		System.out.println("mul the Two Numbers : "+(a*b));
	}
	//div
	public void div(int a,int b)
	{
		System.out.println("div the Two Numbers : "+(a/b));
	}
	

	public static void main(String[] args) 
	{
		ScannerAssignment s1=new ScannerAssignment();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int f1=sc.nextInt();
		System.out.println("Enter Second Number");
		int f2=sc.nextInt();
		
		s1.add(f1, f2);
		s1.sub(f1, f2);
		s1.mul(f1, f2);
		s1.div(f1, f2);
		sc.close();

	}

}
