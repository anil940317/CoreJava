package opps_polymorphisam;

public class RunTimePoly extends Parent
{
	@Override  // overriding the value
	public void colour()
	{
		System.out.println("Yellow");
	}

	public static void main(String[] args) {
		// parent ref and parent object
		Parent P1 = new Parent();
		P1.colour();
		// Child ref and Child object
		RunTimePoly R1 =new RunTimePoly();
		R1.colour();
		// Parent ref and child Object
		Parent P2 = new RunTimePoly();
		P2.colour();
		
		

	}

}
