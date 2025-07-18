package Arrays;

public class Task_A {
	
	public static void main(String[] args) {
		
		int n=5;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i==0|| j==0||j==(n-1)|| i==2)
				{
					System.out.print("* ");
				}
				
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(j==0||j==(n-1) || i+j==n-1 && i< (j/2)+1 || i==j && i<=n/2)
				{
					System.out.print("* ");
				}
				
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i==0|| j==0||j==(n-1)|| i==2)
				{
					System.out.print("* ");
				}
				
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(j==0||j==(n-1)|| i==j)
				{
					System.out.print("* ");
				}
				
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
		
	}

}
