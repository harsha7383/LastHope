package week1;

public class EmpDetailsEx {
	
	int empid;
	String empname;
	
	public void display()
	{
		System.out.println("Employe id is ="+ empid);
		System.out.println("Employe name is ="+ empname);
	}
	public static void main (String args[])
	{
		EmpDetailsEx e1=new EmpDetailsEx();
		e1.empid=101;
		e1.empname="harsha";
		e1.display();
		System.out.println("*****************");
		EmpDetailsEx e2=new EmpDetailsEx();
		e2.empid=102;
		e2.empname="vardhan";
		e2.display();
		System.out.println("*****************");
		EmpDetailsEx e3=new EmpDetailsEx();
		e3.empid=103;
		e3.empname="naidu";
		e3.display();
		System.out.println("*****************");
		EmpDetailsEx e4=new EmpDetailsEx();
		e4.empid=104;
		e4.empname="Padibandla";
		e4.display();
		System.out.println("*****************");
		EmpDetailsEx e5=new EmpDetailsEx();
		e5.empid=105;
		e5.empname="Chowdary";
		e5.display();
		System.out.println("*****************");
		EmpDetailsEx e6=new EmpDetailsEx();
		e6.display();
	}
	

}
