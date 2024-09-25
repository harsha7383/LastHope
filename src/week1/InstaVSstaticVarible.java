package week1;

public class InstaVSstaticVarible {
	
	//varable
	static int count=1;
	
	//constructor
	public  InstaVSstaticVarible()
	{
		System.out.println(count);
		count++;
	}

	public static void main(String[] args) {
		
		InstaVSstaticVarible v1=new InstaVSstaticVarible();
		InstaVSstaticVarible v2=new InstaVSstaticVarible();
		InstaVSstaticVarible v3=new InstaVSstaticVarible();
		InstaVSstaticVarible v4=new InstaVSstaticVarible();
		InstaVSstaticVarible v5=new InstaVSstaticVarible();
		InstaVSstaticVarible v6=new InstaVSstaticVarible();

	}

}
