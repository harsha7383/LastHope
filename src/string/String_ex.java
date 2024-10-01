package string;

public class String_ex {

	public static void main(String[] args) 
	{
		String s1="Harsha";
		String s2="Vardhan";
		
		//length
		System.out.println(s1==s2);
		System.out.println(s1.length());
		
		//conversion to uppercase to lowercase
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//string is immutable
		s1=s1+s2;
		System.out.println( s1 );
		
		//equals
		String act="Welcome to String Class";
		String exc="Welcome to string Class";
		
		System.out.println(act.equals(exc));
		System.out.println(act.equalsIgnoreCase(exc));
		
		//concat()

		System.out.println(s1.concat(act));
		System.out.println(s1+" "+act);
		System.out.println();
	}

}
