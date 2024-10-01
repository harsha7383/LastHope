package string;

import java.util.LinkedHashSet;

public class Duplicate_Characters {

	public static void main(String[] args)
	{
		String s1="Harsha";
		System.out.println(s1);
		
		LinkedHashSet <Character> c1=new LinkedHashSet <Character>();
		
		for(int i=1;i<s1.length();i++)
		{
			c1.add(s1.charAt(i));
		}
		System.out.println(c1);
	}

}
