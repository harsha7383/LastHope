package encapsulation;

public class Facebook_login {

	public static void main(String[] args)
	{
		Login_page l1=new Login_page();
		l1.setUsername("Harsha");
		l1.setPassword("Harry9989");
		l1.dologin(l1.getUsername(),l1.getPassword());
		
		Login_page l2=new Login_page();
		l2.setUsername("Vardhan");
		l2.setPassword("Potter418");
		l2.dologin(l2.getUsername(),l2.getPassword());

	}

}
