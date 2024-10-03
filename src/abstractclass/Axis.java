package abstractclass;

public class Axis implements RBI 
{
	public void intrest()
	{
		System.out.println("Axis....Intrest is : 7%");
	}

	@Override
	public void deposit() {
		System.out.println("Axis....Deposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Axis....WithDraw");
		
	}

	@Override
	public void balanceCheck() {
		System.out.println("Axis....BalanceCheck");
		
	}
	

}
