package conditionalStatements;

public class AN_Pattern {
	
	public static void main(String args[])
	{
		int num=1;
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
