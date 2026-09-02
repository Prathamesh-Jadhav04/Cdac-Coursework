
public class ParameterPassingMain {
	
   private static void  changeAge(int ageCopy) {
	   
	   ageCopy=35;
	   
	   
   }
   private static void changeBook(Book myBookCopy) {
	   
	   myBookCopy.setTitle("Black Clover");
	   myBookCopy.setPrice(12414);
   }
   
	public static void main(String[] args) {
		
		int age =25;
		
		System.out.println("Age Before Change :\n"+age);
		
		 changeAge(age);
		 
		 System.out.println("Age After Change :\n"+age);
		 
		 System.out.println("**************************************");
		 
		 
		 Book mybook=new Book("Harry Porter",1069);
		 
		 System.out.println("Book Before Change\n"+mybook.getTitle());
		 
		 System.out.println("Price Before Change\n"+mybook.getPrice());
		 
		 changeBook(mybook);
		 
		 System.out.println("**************************************");
		 
         System.out.println("Book After Change\n"+mybook.getTitle());
		 
		 System.out.println("Price After Change\n"+mybook.getPrice());
	}

}

