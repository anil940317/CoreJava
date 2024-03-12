package array_String_class;

public class MultiDarray {

	public static void main(String[] args) {
		// New Keyword
		
		int sid[][]= new int[2][3];
		sid[0][0]=10;
		sid[0][1]=20;
		sid[0][2]=30;
		sid[1][0]=40;
		sid[1][1]=50;
		sid[1][2]=60;
		
		System.out.println(sid[1][0]);
		System.out.println("******************nested loop*************");
		for(int r=0;r<sid.length;r++)
		{
			for(int c=0;c<sid[r].length;c++)
			{
				System.out.print(sid[r][c] +"\t");
			}
			System.out.println();
		}
		
		System.out.println("******************for each loop*************");
		
		for(int r[]:sid)
		{
			for(int c:r)
			{
				System.out.print(c + "\t");
			}
			System.out.println();
		}
		
		//Literal way
		
		int id[][] = {{10,40},{20,50},{30,60}};
		System.out.println("***********************Nested for loop***************************************");
		for(int i=0;i<id.length;i++)
		{
			for(int j=0;j<id[i].length;j++)
			{
				System.out.print(id[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("***************************for each loop******************************");
		
		for(int i[]:id)
		{
			for(int j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
	}

}
