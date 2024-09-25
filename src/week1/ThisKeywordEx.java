package week1;

public class ThisKeywordEx {
	
	public void m1()
	{
		System.out.println("M1 is calling******");
		//this.m2();
	}
	
	public void m2()
	{
		System.out.println("M2 is calling******");
		this.m1();
	}

	public static void main(String[] args) {
		
		ThisKeywordEx t1=new ThisKeywordEx();
		//t1.m1();
		t1.m2();
	}

}
