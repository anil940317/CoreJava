package oops_Inheritance;

class A
{
	public void m1()
	{
		System.out.println("M1 is calling");
	}
}

class B extends A
{
	
	public void m2()
	{
		System.out.println("M2 is calling");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) 
	{
	// Parent class ref and parent class object calling only "Parent class"	
	 A a1 = new A();
	
	 a1.m1();
	// Child class ref and child class object calling " parent class + Child class " 
	 B b1 =new B();
	
	 b1.m2();
	 b1.m1();
	 
	// parent class ref and child class object calling only " parent class" 
	 
	 A a2 = new B();
	 
	 a2.m1(); 

	}

}
