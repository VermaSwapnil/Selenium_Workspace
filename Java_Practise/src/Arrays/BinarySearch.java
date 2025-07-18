package Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[]a = {2,4,6,8,10,12,14,16,18,20,22};
		int element=14;
		
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		
		while(li<=hi)
		{
			if(a[mi]==element)
			{
				System.out.println("Element is at index: "+mi);
				break;
			}
			
			else if(a[mi]<element)
			{
				li=mi+1;
			}
			
			else
			{
				hi=mi-1;
			}
			
			mi=(li+hi)/2;
		}
		
		if(li>hi)
		{
			System.out.println("Element not found");
		}
		
	}

}
