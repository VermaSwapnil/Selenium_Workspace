package Arrays;

public class FindDuplicates {
	
	public static void main(String[] args) {
		
		//Brute Force Method
		
		int[]a = {2,4,6,2,10,6,6,12};
		
		System.out.println("Duplicate numbers are: ");
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && (i!=j))
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}
