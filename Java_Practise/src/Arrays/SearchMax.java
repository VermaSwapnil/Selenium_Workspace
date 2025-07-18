package Arrays;

public class SearchMax {
	
	public static void main(String[] args) {
		
		int[]a = {2,10,56,48,99,23,3};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("The maximum number is: "+max);
	}

}
