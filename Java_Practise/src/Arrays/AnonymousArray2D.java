package Arrays;

public class AnonymousArray2D 
{
    public static void main(String[] args) {
		
		AnonymousArray2D.sum(new int[][] {{10,20,30},{40,50}});
	}
	
	static void sum(int[][] num)
	{
		int total=0;
		
		for(int i[]:num)
		{
			for(int j: i)
			{
			total=total+j;
			}
		}
		System.out.println(total);
		
	   }
	
	/*
	 1.Anonymous arrays are arrays without name.
	 2.They are created and initialized in a single line.
	 3.Are both single and multi-dimensional.
	 4.It can be used only once.
	 5.It can be used as an argument in a method.
	 */
	

}
