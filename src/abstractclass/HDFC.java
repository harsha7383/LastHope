package abstractclass;

public class HDFC implements RBI
{
  public void CustomerDetails()
  {
	  System.out.println("HDFC.....CustomerDetails");
  }

@Override
public void deposit() {
	System.out.println("HDFC.....Deposit ");
	
}

@Override
public void withdraw() {
	System.out.println("HDFC.....WithDraw");
	
}

@Override
public void balanceCheck() {
	System.out.println("HDFC.....BalanceCheck 10");
	
}
}
