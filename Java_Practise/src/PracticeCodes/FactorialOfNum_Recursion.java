package PracticeCodes;

import java.util.Scanner;

public class FactorialOfNum_Recursion {
	
	static int fact=1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		FactorialOfNum_Recursion fon = new FactorialOfNum_Recursion();
		int result = fon.calFact(num);
		
		System.out.println("Factorial of the number "+num+" is : "+ result);
		
		
	}
	
	int calFact(int no)
	{
		if (no>1)
		{
		 fact = fact*no;
	      calFact(no-1);
		}
		return fact;
	}

}
