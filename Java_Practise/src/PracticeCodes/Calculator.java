package PracticeCodes;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		String ans;
		
		do {
			
			Scanner sc = new Scanner(System.in);
			
			int result;
			
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			
			System.out.println("Enter num2");
			int num2 = sc.nextInt();
			
			System.out.println("Enter operator");
			String operator = sc.next();
			
			switch (operator)
			
			{
			
			case "+" :
				
				result= num1+num2;
				System.out.println("Addition is : " +result);
				break;
				
			case "-" :
				result =num1-num2;
				System.out.println("Substraction is : "+result);
				break;
				
			case "/" :
				result=num1/num2;
				System.out.println("Division is : "+result);
				break;
				
			case "*" :
				result=num1*num2;
				System.out.println("Multiplication is : "+result);
				break;
				
			case "%" :
				result=num1%num2;
				System.out.println("Modulus is : "+ result);
				break;
				
				default :
					System.out.println("Not an operator");
			
			}
			
			System.out.println("Do you want to continue if yes press Y, If No then N");
			ans= sc.next();
		}
		
		while(ans.equals("y") || ans.equals("Y"));
	}

}
