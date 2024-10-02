package Polymorphism;

public class AmazonSearch 
{
	public void  search(String pname)
	{
		System.out.println("Search product by product name pname "+pname);
	}
	public void  search(int price)
	{
		System.out.println("Search product by product name price "+price);
	}
	public void  search(String pname,int price)
	{
		System.out.println("Search product by product name pname "+pname+" & price "+price);
	}
	public void  search(String pname,String bname)
	{
		System.out.println("Search product by product name pname "+pname+" & bname "+bname);
	}
	public void  search(int price,String bname)
	{
		System.out.println("Search product by product name price "+price+" & Bname "+bname);
	}
	

	

}
