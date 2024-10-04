package CollectionFramework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector<Integer> v1=new Vector<Integer>();
		if(v1.isEmpty())
		{
			v1.add(10);
			v1.add(20);
			v1.add(30);
			v1.add(10);
			v1.add(40);
			System.out.println(v1.isEmpty());
			System.out.println(v1.size());
			System.out.println(v1);
			
			//remove
			v1.remove(3);
			System.out.println(v1);
			
			//add element
			v1.add(3, null);
			System.out.println(v1);
			
			//using contains
			System.out.println("Is NUll is there :"+v1.contains(null));
			System.out.println("Is contains no 50 :"+v1.contains(50));
			
				
			
		}

	}

}
