package oops_Encapsulation;

import java.util.Scanner;

public class Login_Scanner {

	public static void main(String[] args) 
		{
		
		Scanner sc =new Scanner(System.in);
			LoginDemo  Ld = new LoginDemo();
			System.out.println("Enter Username");
			Ld.setUsername(sc.nextLine());
			System.out.println("Eneter Password");
			Ld.setPassword(sc.nextLine());
			
			System.out.println("enter user name : "+Ld.getUsername());
			
			Ld.dologin(Ld.getUsername(), Ld.getPassword());
			

		}

}



