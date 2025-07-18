package Arrays;

public class AnonymousArray1D {
	
	public static void main(String[] args) {
		
		AnonymousArray1D.sum(new int[] {10,20,30});
	}
	
	static void sum(int[] num)
	{
		int total=0;
		
		for(int i:num)
		{
			total=total+i;
		}
		System.out.println(total);
		
	}

}
