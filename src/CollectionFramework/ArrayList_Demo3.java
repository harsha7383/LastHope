package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo3 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(20);
		a1.add(50);
		System.out.println(a1);
		
		System.out.println("*******using for loop*******");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("*****For each loop******");
		for(Integer i:a1)
		{
			System.out.println(i);
		}
		
		System.out.println("*******Iterator********");
		
		Iterator<Integer> ir=a1.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}

	}

}
