package CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) 
	{
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(10);
		t1.add(3);
		t1.add(11);
		t1.add(4);
		t1.add(9);
		t1.add(2);
		t1.add(8);
		t1.add(1);
		
		System.out.println(t1);
		System.out.println("The Elements size is:"+t1.size());
		System.out.println(t1.descendingSet());
		System.out.println("headset returns less than element"+t1.headSet(10));
		System.out.println("tailset returns grather than element"+t1.tailSet(10));
		System.out.println("subset returns and equal to element"+t1.subSet(4, 10));
		System.out.println(t1.first());
		System.out.println(t1.last());
		

	}

}
