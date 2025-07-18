package PracticeCodes;

public class Swap2Numbers {
	
	public static void main(String[] args) {
		
		//Without using 3rd variable
		
		int a=10, b=20;
		
		a = a+b;
		b= a-b;
		a=a-b;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		
		/*
		int a =10;
		int b = 20;
		int c ;
		
		c = a;
		a=b;
		b=c;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		*/
	}

}
