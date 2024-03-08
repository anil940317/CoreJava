package week2;

public class CompiletimeParameter {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int c, int d)
	{
		return c-d;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public double div (int c, int d)
	{
		return c/d;
	}
	public static void main(String[] args) {


		CompiletimeParameter C1 = new CompiletimeParameter();
		
		int A =C1.add(10, 15);
		System.out.println("Add = "+A);
		
		int S =C1.sub(10,15);
		System.out.println("Sub = "+S);
		
		int M = C1.mul(10, 15);
		System.out.println("Mul = "+M);
		
		double D =C1.div(27, 4);
		System.out.println("Div = "+D);

	}

}
