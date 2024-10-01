package Array;

public class LiteralWay_Multi {

	public static void main(String[] args) 
	{
		String data[][]= {{"Harsha","Navooru"},{"Vardhan","Crpalli"},{"Naidu","Palli"}};
		System.out.println("Rows of the array is:"+data.length);
		System.out.println("columns of the array is:"+data[0].length);
		
		System.out.println("The data is :"+data[1][0]);
		
		/*for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"  ");
			}
			System.out.println();
		}*/
		
		for(String i[]:data)
		{
			for(String j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
