package week1;

import java.util.Scanner;

public class Readinputfromuser {

	public static void main(String[] args) {
		
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Your Name");
	  String name=sc.nextLine();
	  System.out.println("Enter Your Gender (M/F)");
	  String data=sc.nextLine();
	  int gen=data.charAt(0);
	  System.out.println("Enter Your Age ");
	  int age=sc.nextInt();
	  System.out.println("Welcome : "+name);
	  System.out.println("Your Gender is:"+gen+" & Your Age is :"+age);
	  sc.close();

	}

}
