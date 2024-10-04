package CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		System.out.println(l1.isEmpty());
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(10);
		l1.add(40);
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
		System.out.println(l1);
		
		//Extrs Methods
		l1.addFirst(100);
		l1.addLast(200);
		System.out.println(l1);
		
		System.out.println(l1.getFirst()+" : "+l1.getLast());
		
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		
		
		
		

	}

}
