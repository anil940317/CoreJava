package array_String_class;

public class SingleArray {

	public static void main(String[] args) {
		
		// Single Array with new Keyword
		int Sid[]= new int[5];
		
		Sid[0]=101;
		Sid[1]=102;
		Sid[2]=103;
		Sid[3]=104;
		Sid[4]=105;
		
		System.out.println("Total elementd in Array : "+Sid.length);
		System.out.println(Sid[3]);
	    System.out.println("******************Single for Loop********");
		for(int i=0; i<=4;i++)
		{
			System.out.println(Sid[i]);
		}
		System.out.println("******************for each Loop********");
		
		for(int i : Sid)
		{
			System.out.println(i);
		}
		
		/// Literal way
		
		int id[]= {121,122,123,124,125};
		System.out.println("******************Single for Loop********");
		for(int i=0; i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		System.out.println("***************** for each Loop********");
		
		for (int i : id)
		{
			System.out.println(i);
		}
		///
		
		String name[] = {"Ani","Divya","Ram","Govind","Vamc"};
		System.out.println("Size of array :" + name.length);
		System.out.println("******************Single for Loop********");
		for(int i=0; i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("****************** for each Loop********");
		
		for(String i: name)
		{
			System.out.println(i);
		}
		
		System.out.println("****************** As Object ********");
		
		Object empdata[]= {"sara","pune",30,"M",9978567845L};
		
		for(Object i : empdata)
		{
			System.out.println(i);
		}

	}

}
