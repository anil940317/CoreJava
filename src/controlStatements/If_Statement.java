package controlStatements;

import java.util.Scanner;

public class If_Statement 
{

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter age : ");
		int num = sc.nextInt();
		
		if (num>18)
		{
			System.out.println("person eligiable for Vote");
		}
		
		System.out.println("end of program");
	}
}
