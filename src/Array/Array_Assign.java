package Array;

public class Array_Assign {

	public static void main(String[] args) 
	{
		Object Rdata[][]= {{"Username","Password"},{"Admin","admin123"},{"Test1","test123"},{"Test2","test123"},{"Test3","Admin123"},{"Test4","test123"}};
		System.out.println("Number of Rows is:"+(Rdata.length-1));
		System.out.println("Number of columns is:"+(Rdata[0].length));
		
		for(Object i[]:Rdata)
		{
			for(Object j:i)
			{
				System.out.print(j+"    ");
			}
			System.out.println();
		}

	}

}
