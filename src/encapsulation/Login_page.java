package encapsulation;

public class Login_page {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
     // Business 
	public void dologin(String un,String pas)
	{
		System.out.println("Hello ! you are loginned with "+un);
	}
}
