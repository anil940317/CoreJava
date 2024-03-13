package array_String_class;

public class StringDemo {

	public static void main(String[] args) 
	{
		// length, upper, lower case, charAt, index of, equals, equals ignore case
		
		
		
		String S1 ="Hello All";
		
		System.out.println("find lenth of S1 String : "+S1.length());
		
		System.out.println("write S1 as upper case : "+S1.toUpperCase());
		System.out.println("write S1 as lower case : "+S1.toLowerCase());
		
		System.out.println("find charater at 8 position :" +S1.charAt(8));
		
		System.out.println("find A charater position in S1 String :"+S1.indexOf("A"));
		
		String S2 = "Hello All";
		
		System.out.println(S1==S2);
		
		System.out.println("find S1 equals to S2 :"+ S1.equals(S2));
		
		String S3 = "hello all";
		
		System.out.println("find S1 equals ignore case to S3 :"+ S1.equalsIgnoreCase(S3));
		
		// Substring, trim, contains, start with, end with concat
		
		String S4 = "   Welcome   ";
		
		System.out.println("trim : "+ S4.trim());
		
		String S5 ="Hello world";
		
		System.out.println("Contains in S5 : "+ S5.contains("wo"));
		
		System.out.println("Start with : " +S5.startsWith("H"));
		
		
		System.out.println("ends with : "+S5.endsWith("world"));
		
		System.out.println("ends with : "+S5.endsWith("d"));
		
		
		System.out.println(S1.concat(S4));
		
		// Split, replace, is empty, tochararray		
				


	}

}
