package controlStatements;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the number");
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
		
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(i*j+"\t");
		}
		System.out.println();
	}



	}

}
