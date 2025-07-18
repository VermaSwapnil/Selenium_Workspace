package Arrays;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int[]a= {54,62,98,10,34,87,99};
		int temp;
		
		for(int i=0 ;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==1)
			{
				break;
			}
		}
		
		System.out.println("The second largest element is: "+a[1]);
	}

}
