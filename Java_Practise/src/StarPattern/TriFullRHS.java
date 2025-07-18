/*
 
  * * * * 
    * * * 
      * * 
        * 
        * 
      * * 
    * * * 
  * * * * 
 
 */

package StarPattern;

public class TriFullRHS {
	
	public static void main(String[] args) {
	
	
	for(int i=1;i<=4;i++)
    {
   	 for(int j=1;j<=i;j++)
   	 {
   		 System.out.print("  ");
   	 }
   	 
   	 for(int k=4;k>=i;k--)
   	 {
   		 System.out.print("* ");
   	 }
   	 
   	 System.out.println();
    }
	
	
	for(int i=5;i<=8;i++)
	{
		for (int j=8;j>=i;j--)
		{
			System.out.print("  ");
		}
		
		 for (int k=5;k<=i;k++)
		 {
			 System.out.print("* ");
		 }
		 
		 System.out.println();
	}
	
	}

}