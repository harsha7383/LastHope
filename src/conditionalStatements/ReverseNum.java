package conditionalStatements;

public class ReverseNum {

	public static void main(String[] args) 
	{
		int num=987654321,r,sum=0;
		int temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum*10+r;
		}
		System.out.println("The Reverse String "+temp+" is "+sum);
	}

}
