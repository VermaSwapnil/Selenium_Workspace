package PracticeCodes;
import java.util.Scanner;

public class ReverseOfString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string value");
		String name = sc.next();
		String input= name;
		String rev="";
		
		for(int i= (name.length()-1);i>=0; i--)
		{
			rev = rev + name.charAt(i);
			
		}
		
		System.out.println("Reverse of string "+ input +" is : "+rev);
	}

}
