package PracticeCodes;

public class LeapYear {
	
	public static void main(String[] args) {
		
		int year = 2025;
		
		/*if (year%4==0)
		{
			
			if(year%100==0)
			{
                if(year%400==0)
                 {
                        System.out.println( year+ " : Leap year");
                  }
                   else {
				
			        System.out.println(year+" : Not a leap year");
                   }                                        
			}
			
			else {
				System.out.println( year+ " : Leap year");
			}
			
			}
		else {
			System.out.println(year+" : Not a leap year");
		}*/
		
		
		if (year%400==0 || (year%4==0 && year%100!=0))
		{
			System.out.println( year+ " : Leap year");
		}
		
		else {
			System.out.println(year+" : Not a leap year");
		}
		
	}

}
