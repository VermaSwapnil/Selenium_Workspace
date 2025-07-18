package PracticeCodes;
import java.util.Scanner;


public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = s.next();
		
		System.out.println("Enter Gender");
		char gender = s.next().charAt(0);
	
		System.out.println("Enter age");
		int age = s.nextInt();
		
		System.out.println("Enter phone number");
		long phoneNumber = s.nextLong();
		
		/*s.nextBoolean();
		s.nextFloat();
		s.nextDouble();
		*/
		
		System.out.println("Name : "+ name);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("Phone Number : "+ phoneNumber);
	}

}
