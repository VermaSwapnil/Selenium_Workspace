package PracticeCodes;
import java.util.Scanner;

public class ReverseOfNum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int number = num;
		
		int rem=0,rev =0;
		
		while(num!=0)
		{
			rem=num%10;
			rev= rev*10 + rem;
			num= num/10;
		}
		
		System.out.println("Reverse of number "+number + "is :"+rev);
		
	}

}
