package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add(400);
		a1.add(200);
		System.out.println(a1);
		int num=a1.get(3);
		System.out.println(num);

	}

}
