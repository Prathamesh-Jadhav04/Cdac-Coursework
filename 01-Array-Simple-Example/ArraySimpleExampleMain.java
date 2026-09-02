
public class ArraySimpleExampleMain {

	public static void main(String[] args) {
	 //declaring an array of 5 int;
		
		
		int[] numbers= new int [5];
		
		numbers[0]=34;
		
		numbers[1]=35;
		
		numbers[2]=64;
		
		numbers[3]=78;
		
		numbers[4]=67;
		
		
		
		int arraysize=numbers.length; 
		
		for(int index = 0 ;index < arraysize ; index++) {
			
			int number =numbers[index];
			
			System.out.println(number);
			
		}
		
		System.out.println("Loop Is Terminated!!");
		
		System.out.println("*****************************");
		
		System.out.println(" For Each Loop Begins !!");
		
		for (int val : numbers)
			
			System.out.println(val);
		
		

	}

}
