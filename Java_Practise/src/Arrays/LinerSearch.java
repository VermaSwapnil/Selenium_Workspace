package Arrays;

public class LinerSearch {
	
	public static void main(String[] args) {
		
		int[]a= {1,3,6,10,12,15};
		int element=10;
		
		for(int i=0;i<a.length; i++)
		{
			if(a[i]==element)
			{
				System.out.println("The index of the element is : "+ i);
			}
		}
	}

}
