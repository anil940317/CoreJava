package week1;

public class WrapperClass 
{
	public static void main(String arg[])
	{

// Object to primitive data type conversion
		String s1= "100";
		
		System.out.println(s1+101);
	// Object to integer conversion	
		int num = Integer.parseInt(s1); // Wrapper class
		
		System.out.println(num+102);
		
		
		String s2="235.235";
		
		System.out.println(s2+102);
	// Object to Float conversion	
		float num2 = Float.parseFloat(s2); //Wrapper class
		
		System.out.println(num2+num);
		
		
// Primitive data type to Object conversion
		int x= 251245;
		
		System.out.println(x+125634);
		
		String S = String.valueOf(x);
		
		System.out.println(S+1245896);
		
	}
  
}
