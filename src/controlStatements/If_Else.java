package controlStatements;

import java.util.Scanner;

public class If_Else 
{
	
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Check weather number is even or odd");
		
		int num=sc.nextInt();
		
		if (num%2 == 0)
		{
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		}
	}


