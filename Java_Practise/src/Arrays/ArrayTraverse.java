package Arrays;

public class ArrayTraverse {
	
	public static void main(String[] args) {
		
		int [] a= {10,20,30};
		
		//Way1--> For loop
		
		/*for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		*/
		
		//Way2--> For each loop
		
		/*for(int i:a)
		{
			System.out.println(i+" ");
		}
		*/
		
		//Way3--> While loop
		
		/*int i=0;
		while(i<a.length)
		{
			System.out.print(a[i]+" ");
			i++;
		}
		*/
		
		//Way4--> Do While
		
		int i=0;
		do
		{
			System.out.print(a[i]+" ");
			i++;
		}
		while(i<a.length);
		
	}

}
