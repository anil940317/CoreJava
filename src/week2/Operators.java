package week2;

public class Operators 
{

	public static void main(String arg[])
	{
		// Arithmetic operators +,-,*,/,%
		System.out.println("Arithmetic Operators");
		int a =10, b=20;
		
		System.out.println("addition"+ (a+b));
		System.out.println("subtraction"+ (a-b));
		System.out.println("multiplication"+ (a*b));
		System.out.println("division"+ (a/b));
		System.out.println("moduler"+ (a%b));
		
		//Unary Operators ++, --, !
		System.out.println("Unary Operators");
		int c=30;
		int d =++c;
		
		System.out.println("pre incriment:"+ c);
		System.out.println("pre incriment:"+ d);
		
		int e = a++;
		
		System.out.println("post increment:"+ a);
		System.out.println("post increment:"+ e);
		System.out.println("post increment:"+ a);
		
		int f = --b;
		
		System.out.println("pre Decriment:"+b);
		System.out.println("pre Decrement:"+f);
		
		int g = c--;
		
		System.out.println("post increment:"+c);
		System.out.println("Post increment:"+g);
		
		
		System.out.println("a="+a +","+ "b="+b +","+"c="+c +","+"d="+d +","+ "e="+e +","+"f="+f+ ","+ "g="+g);
		
		boolean h = true;
		
		System.out.println("Logical Negate:"+ !h);
		
		// Relational Operator >,<, >=,<=,==,!=
		
		System.out.println("Relational Operater");
		
		System.out.println(a>b);//false
		System.out.println(c<d); //true
		System.out.println(a<=f); //true
		System.out.println(a>=g);//false
		System.out.println(d==g);//true
		System.out.println(b!=f);//false
		
		// Logical operator &&, ||, !
		
		System.out.println("Logical Operater"); //
		
		
		
		
		
		
		
		
		
		
	}
		
	
}
