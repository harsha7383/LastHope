package encapsulation;

class Employee
{
	private int id = 101;
	private String name ="Harsha";
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show()
	{
		System.out.println("The employe id is :"+id);
		System.out.println("The employe name is :"+name);
	}
}



public class Encapsulation_demo {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.show();
		//e1.id=200;
		e1.setId(118);
		e1.setName("Vardhan");
		e1.show();

	}

}
