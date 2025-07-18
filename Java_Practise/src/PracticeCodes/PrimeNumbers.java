package PracticeCodes;
import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int input= num, temp=0;
		
		for(int i=2;i<=num-1 ;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		
		if(temp==0)
		{
			System.out.println(input+" Is a prime number");
		}
		else
		{
			System.out.println(input+ " is not a prime number");
		}
	}

}
