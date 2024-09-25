package conditionalStatements;

public class ThreeNmerFindLarge {

	public static void main(String[] args) 
	{
		int a=100,b=290,c=178;
		
		if(a>b && a>c)
		{
			System.out.println(a+" is the largest number "+b+" & "+c);
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is the largest number "+a+" & "+c);
		}
		else
		{
			System.out.println(c+" is the largest number "+a+ "& "+b);
		}

	}

}
