package abstractclass;

public class Abstract_Ex extends Abstract_Demo 
{
	
	public void fast ()
	{
		System.out.println("This is child class method");
	}
	@Override
	public void show() 
	{
		System.out.println("This is implemented by child class");
	}

	public static void main(String[] args) 
	{
		Abstract_Ex a1=new Abstract_Ex();
		a1.run();
		a1.show();
		a1.fast();
		
		System.out.println("*****************");
		Abstract_Demo a2=new Abstract_Ex();
		a2.run();
		a2.show();
		
	}

	
}
