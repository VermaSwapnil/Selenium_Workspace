package BasicsOfJava;

public class Array {
	
	public static void main(String[] args) {
		
		int [] array = new int[2];
		
		for (int index=0; index< array.length; index++)
		{
			array[index] =(int)(Math.random()*1000);
			//System.out.println(index);
		}
		
		for (int var: array)
		{
			System.out.println(var);
		}
		
		//Print in reverse order
		
		int [] array1 = new int[5];
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		array1[4]=5;
		
		for (int i=array1.length-1;i>=0; i--)
		{
			System.out.println(array1[i]);
		}
		
	}

}
