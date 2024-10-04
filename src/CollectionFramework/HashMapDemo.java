package CollectionFramework;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> h1=new HashMap<String,Integer>();
		System.out.println(h1.isEmpty());
		h1.put("Navooru",524345);
		h1.put("vedayapalem",524004);
		h1.put("bellandur", 560103);
		h1.put("ramurthynagar",524001);
		
		System.out.println("Total elements is :"+h1.size());
		System.out.println(h1.isEmpty());
		System.out.println(h1);
		System.out.println("value of bellandur is :"+h1.get("bellandur"));
		System.out.println(h1);
		h1.put("bellandur",560109);
		System.out.println(h1);
		
		
		System.out.println("Iteration of map using entry interface");
		

	}

}
