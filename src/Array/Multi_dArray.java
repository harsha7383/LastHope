package Array;

public class Multi_dArray {

	public static void main(String[] args)
	{
		int arr[][]=new int[2][3];
		arr[0][0]=100;
		arr[0][1]=101;
		arr[0][2]=102;
		
		arr[1][0]=103;
		arr[1][1]=104;
		arr[1][2]=105;
		
		System.out.println("The length is :"+arr.length);
		System.out.println("The Data is :"+arr[1][1]);
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}

	}

}
