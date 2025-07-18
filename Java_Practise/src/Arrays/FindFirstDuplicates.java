package Arrays;

public class FindFirstDuplicates {
	
	public static void main(String[] args) {
		
        int[]a = {2,4,6,2,10,6,6,12};
		
		for(int i=0;i<a.length-1;i++)
		{
			int temp =0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && (i!=j))
				{
					System.out.println(a[j]);
					temp=1;
					break;
					
				}
				
				if(temp==1)
				{
					break;
				}
			}
		}
	}

}
