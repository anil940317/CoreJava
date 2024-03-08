package week2;

public class Exercise1 {

	public static void main(String[] args) 
	{
		
		int item_A=200; 
		int item_B = 80; 
		int item_C = 150;
		
		//Total no.of items price 
		int a = item_A*3;
		int b = item_B*5;
		int c = item_C*2;
		
		System.out.println("Item A total = "+ a);
		System.out.println("Item B total = "+ b);
		System.out.println("Item C total = "+ c);
				
		//With discount available for all items
			double A= (a-(a*0.15));
			double B= (b-(b*0.15));
			double C= (c-(c*.15));
		System.out.println("item A total with 15% discount = "+ A);
		System.out.println("item B total with 15% discount = "+ B);
		System.out.println("item C total with 15% discount = "+ C);
		
		 double Total= A+B+C;
		 
		 System.out.println("Total items cost = "+Total);
		
		 // Add 2% discount on total value
		 
		 double Bill= Total-(Total*0.02);
		 
		 System.out.println("total bill Alex with 2% discount = "+ Bill);
		

	}

}
