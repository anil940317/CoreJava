package oops_Encapsulation;

public class LoginPage {

	public static void main(String[] args) 
	{
		LoginDemo  Ld = new LoginDemo();
		
		Ld.setUsername("Anil");
		Ld.setPassword("Test@123");
		
		Ld.dologin(Ld.getUsername(), Ld.getPassword());
		

	}

}
