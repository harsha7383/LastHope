package abstractclass;

public class TestBanks {

	public static void main(String[] args) 
	{
		HDFC h1=new HDFC();
		h1.deposit();
		h1.withdraw();
		h1.balanceCheck();
		h1.CustomerDetails();
		System.out.println(RBI.x);
		
		
		System.out.println("************************");
		
		RBI r1=new HDFC();
		r1.deposit();
		r1.withdraw();
		r1.balanceCheck();
		
		System.out.println("******************");
		
		Axis a1=new Axis();
		a1.deposit();
		a1.withdraw();
		a1.balanceCheck();
		a1.intrest();
		
		System.out.println("***************************************");
		
		RBI r2=new Axis();
		r2.deposit();
		r2.withdraw();
		r2.balanceCheck();
		
		

	}

}
