
public class ArrayOperationMain {
	
	   private static int[]getNameLengths (String[] namesCopy){
		   
		int size =namesCopy.length;
		
		   int[] nameLengths=new int[size];
		   
		   int index =0;
		   
		   for (String name:namesCopy) {
			   
			   name.length();
			   
			   int currentLength=name.length();
			   
			   nameLengths[index]=currentLength;
			   
			   index++;
			 }
		   return nameLengths;
	   }
	

	public static void main(String[] args) {
		
		String [] names= 
				
			{"Mizo","Saylii","Payal","Shrutika","tanishka","ovwi","Sharavni"};
		
		int[] allLengths=getNameLengths(names);
		
		for (int len :allLengths)
			
			System.out.println(len);
	
	}

}
