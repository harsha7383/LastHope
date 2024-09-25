package week1;

public class ConstructorwithTHISkeyword {
	
	int id;
	String name;
	
	public ConstructorwithTHISkeyword(int id,String name)
	{
		id=id;
		name= name;
		this.id=id;
		this.name=name;
	}
	
	public void show()
	{
		System.out.println("This is show Method*****");
		System.out.println("Id is :"+id);
		System.out.println("name is:"+name);
		
	}
	

	public static void main(String[] args) {
		ConstructorwithTHISkeyword t1=new ConstructorwithTHISkeyword(201,"naidu");
	    t1.show();
		

	}

}
