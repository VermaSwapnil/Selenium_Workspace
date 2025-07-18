package Arrays;

public class NthElement {
	
public static void main(String[] args) {
		
		int[]a= {54,62,98,10,34,87,99};
		int temp;
		int k=4;
		
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
			if(i==k-1)
			{
				System.out.println("The "+k+" largest element is: "+a[i]);
				break;
			}
         }
      }
}