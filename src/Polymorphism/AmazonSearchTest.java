package Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args) 
	{
		AmazonSearch a1=new AmazonSearch();
		a1.search(10000);
		a1.search("IPhone");
		a1.search(5000,"Samsung");
		a1.search("Moto",8000);
		a1.search("poco","mi");
		
		

	}

}
