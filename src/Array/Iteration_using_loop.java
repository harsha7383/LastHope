package Array;

public class Iteration_using_loop {

	public static void main(String[] args) 
	{
		String location[]=new String[4];
		location[0]="Nellore";
		location[1]="kavali";
		location[2]="chennai";
		location[3]="ongole";
		System.out.println("The date of thge array is "+location.length);
		System.out.println("Data is "+location[2]);
		
		/*for(int i=0;i<4;i++)
		{
			System.out.println(location[i]);
		}*/
		
		for(String i:location)
		{
			System.out.println(i);
		}
		
		
		

	}

	

}
