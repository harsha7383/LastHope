package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		System.out.println("Is List is Empty "+a1.isEmpty());
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(20);
		a1.add(40);
		System.out.println("Is List is Empty "+a1.isEmpty());
		System.out.println("Total Elements are :"+a1.size());
		System.out.println("Is 50 Available ?"+a1.contains(50));
		System.out.println("Is 10 Available ?"+a1.contains(10));
		
		//remove
		a1.remove(2);
		System.out.println(a1);
		
		//add element at 2 position 30
		a1.add(2, 30);
		System.out.println(a1);
		
		//clear the list
		//a1.clear();
		System.out.println(a1);
		
		//sort the list 
		Collections.sort(a1);
		System.out.println(a1);
		

	}

}
