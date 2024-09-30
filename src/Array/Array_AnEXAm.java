package Array;

public class Array_AnEXAm {

	public static void main(String[] args) 
	{
		double marks[] =new double[4];
		marks[0]=48.11;
		marks[1]=54.85;
		marks[2]=67.65;
		marks[3]=84.24;
		System.out.println("The Array array data is :"+marks.length);
		System.out.println("Addition of all numbers uis : "+(marks[0]+marks[1]+marks[2]+marks[3]));
		
		/*for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}*/
		
		//for each loop
		for(double i:marks)
		{
			System.out.println(i);
		}

	}

}
