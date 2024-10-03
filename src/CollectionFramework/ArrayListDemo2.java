package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		System.out.println("Is List is Empty "+a1.isEmpty());
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println("Is List is Empty "+a1.isEmpty());
		System.out.println("Total Elements are :"+a1.size());
		System.out.println("Is 50 Available ?"+a1.contains(50));
		System.out.println("Is 10 Available ?"+a1.contains(10));

	}

}
