package week1;

public class AccessModifierDemo {

	int id = 101; //default
	public String name = "harsha";
	private int empid= 9898998;
	
	public static void main (String args[])
	{
		AccessModifierDemo a1=new AccessModifierDemo();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.empid);
	}
	
}
