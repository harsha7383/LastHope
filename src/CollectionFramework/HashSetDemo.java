package CollectionFramework;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		HashSet<Integer> h1=new HashSet<Integer>();
		System.out.println(h1.isEmpty());
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(20);
		h1.add(40);
		h1.add(null);
		System.out.println(h1.isEmpty());
		System.out.println(h1.size());
		System.out.println(h1);
		
		

	}

}
