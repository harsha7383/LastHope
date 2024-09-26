package conditionalStatements;

public class WhileLoop_NoIterations_ex {

	public static void main(String[] args) 
	{
		int num=9878,r,sum=0;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r;
		}
		System.out.println("sum of digits :"+sum);

	}

}
