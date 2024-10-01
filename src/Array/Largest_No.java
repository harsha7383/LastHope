package Array;

public class Largest_No {

	public static void main(String[] args) 
	{
		int[] array= {40,20,87,93};
		
		int num=array[0];
		
		for(int i:array)
		{
			if(i>num)
			{
				num=i;
			}
		}
		System.out.println("The Largest Number of Array is :"+num);
		
		
		
	}
}
