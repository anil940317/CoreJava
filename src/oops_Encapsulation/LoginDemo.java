package oops_Encapsulation;

public class LoginDemo 
{
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
	
	public void dologin( String Uname, String PWD)
	{
		System.out.println("enter username : "+Uname);
		System.out.println("User loged in with Username : "+Uname);
	}

}
