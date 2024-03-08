package week1;

public class TypeCasting 
{
	// Primitive to primitive data type change
	// Implicit (Small to large data type)
	
	int x = 300;
	long y = x;
	
	long z= 98756891125689L;
	int w = (int)z;
	
	public static void main(String arg[])
	{
		TypeCasting T = new TypeCasting();
		
		System.out.println("Print y value ="+ T.y); // Implicit conversion
	
		System.out.println("print w value ="+ T.w); // Explicit conversion
	}
	
}
	
