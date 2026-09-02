
public class BookMain {
	
         static {
        	 System.out.println("BookMain Class is Loaded.........");
         }
         
	public static void main(String[] args) {
		
		System.out.println("BookMain execution begins.........");
		
		
	/*	int val=;    =====>> local veriables cannot be Initialize;
		System.out.println(val); */
		
		
		Book b1=new Book();
		
	    Book b2 =new Book("Rich Dad Poor Dad",234);
	    
	    Book b3= new Book(1200,"Alice in Wonderland");
	    
	    System.out.println("Current No of Books:"+Book.gettotalnumberofbooks());
	    
	   
	    
	    Book b4=new Book();
	    
	    Book b5=new Book();
	    
	    System.out.println("Current No of Books:"+Book.Bookcount);
	    
	    for (int i=1;i<=10;i++)
	    {
		
		new Book();
		
	    }
	  System.out.println("Current No of Books:"+Book.Bookcount);

	}

}
