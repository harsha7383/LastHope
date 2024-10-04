package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
		System.out.println(l1.isEmpty());
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(20);
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		System.out.println(l1);
		
		//remove duplicates
		
		String s1="aabbccddee";
		System.out.println(s1);
		
		LinkedHashSet<Character> c1=new LinkedHashSet<Character>();
		
		for(int i=0;i<s1.length();i++)
		{
			c1.add(s1.charAt(i));		
		}
		System.out.println(c1);

	}

}
