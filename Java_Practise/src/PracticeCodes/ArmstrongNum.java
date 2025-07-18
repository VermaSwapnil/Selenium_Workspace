package PracticeCodes;
import java.util.Scanner;

public class ArmstrongNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = sc.nextInt();
		int num= input, num1= input;
		int digit=0, rem=0, arm=0;
		
		//Calculating number of digits
		
		while(num!=0)
		{
			num=num/10;
			digit=digit+1;
			
		}
		
		while(num1!=0)
		{
			rem=num1%10;
			int multi=1;

			for(int i=1;i<=digit;i++)
			{
				multi=multi*rem;
			}
			
			arm= arm+multi;
			num1= num1/10;
		}
		
		if(arm==input)
		{
			System.out.println(input + " Number is an Armstrong number");
		}
		
		else {
			
			System.out.println(input + " Number is not an Armstrong number");
		}
		
	}

}
