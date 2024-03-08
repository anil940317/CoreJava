package week1;

public class StudentData 
{
    
	// Local variable declaration
	
	public void exam1() // instance method1
	{
		int Marks = 90; //Local variable
		System.out.println("marks from exam1 ="+ Marks);
	} 
	
	public void exam2() // instance method2
	{
		int Marks =80; //local variable -- local variable scope is method level only
		System.out.println("marks from exam2 ="+ Marks);
	}
	
	// Instance variable declaration
	 
	int id = 12;
	String name ="Test";
	
	// Static variable declaration
	
	static String Cname ="CISSP";
	
	public static void main(String arg[]) // calling function // starting point of Code execution
	{
		// main also a method, what ever Variable we are creating is called local variable
		int Marks =75; //local variable3
		
		
	/// first object creation
		
		// Object is super class * we can all the data(class,methods,variable etc.) from class using object
		StudentData S1 = new StudentData(); // object creation 
		
		S1.exam1(); // with object we are calling local variable inside of instance method1
		S1.exam2(); //with object we are calling local variable inside of instance method2
		
		// we don't need object to call static variable
		System.out.println("marks from exam3 ="+ Marks); //we are calling static variable
		
		// calling instance variables using Object
		
		System.out.println("student name ="+ S1.name); 
		System.out.println("student id ="+ S1.id);
		
		// calling static variable 
		
		System.out.println("student college name ="+Cname);
		
		System.out.println("***************************");
		
	/// Second object creation
		
		StudentData S2 = new StudentData(); //second object creation
		
		S2.exam1(); //with object2 we are calling local variable of instance method1
		S2.exam2(); //with object2 we are calling local variable of instance method2
		
		System.out.println("marks from exam3 ="+ Marks); //we are calling static variable
		
		
		// calling instance variables using Object2
		System.out.println("student name ="+ S2.name);
		System.out.println("student name ="+ S2.id);
		
		// calling static variable
		
		System.out.println("student collage name ="+Cname);
		
	}
	
	
	
}
