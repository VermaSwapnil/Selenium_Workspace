package PracticeCodes;
import java.util.Scanner;

public class PallindromeNum {
	public static void main(String[] args) {
		

	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number :");
	int input= sc.nextInt();
	int num=input, rev=0, rem=0;
	
	while(num!=0)
	{
		rem= num%10;
		rev= rev*10+ rem;
		num = num/10;
	}
	
	if(rev==input)
	{
		System.out.println( input + " Number is pallindrome");
	}
	
	else {
		System.out.println( input + " Number is not pallindrome");
	}
	
	}

}
