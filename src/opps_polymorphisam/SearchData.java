package opps_polymorphisam;

import java.util.Scanner;

public class SearchData 
{
	public void search(String name)
	{
		System.out.println("Eneter you name : "+ name);
	}
	
	public void search(String pname, int price)
	{
		System.out.println("enter your pnmae : "+pname);
		System.out.println("enter price : "+ price);
	}

	public static void main(String[] args)
	{
		SearchData S = new SearchData();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter name : ");
		S.search(sc.nextLine());
		
		System.out.println("please enter productname : ");
        String ProdName = sc.nextLine();
        System.out.println("please enter productprice : ");
        int ProdPrice = sc.nextInt();
		S.search(ProdName, ProdPrice);
		
		

	}

}
