package week1;

public class StudentCodeEx {
	
	int id=101;
	String name = "harsha";
	
	public void show() {
		System.out.println(id);
		System.out.println(name);
		
	}
	public static void main (String args[])
	{
		StudentCodeEx s1=new StudentCodeEx();
		s1.show();
	}
}
