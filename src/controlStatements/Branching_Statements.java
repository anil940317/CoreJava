package controlStatements;

public class Branching_Statements {
	
	public String show()
	{
		return "Hello World";
	}

	public static void main(String[] args) 
	{
		
		System.out.println("program started");
		// break statement
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;
			}else {
				System.out.println(i);
			}
		}
		// Continue statement
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}else {
				System.out.println(i);
			}
			
		}
		
		Branching_Statements b1 = new Branching_Statements();
		String S = b1.show();
		
		System.out.println(S);
	}

}
