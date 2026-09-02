
public class Book {
	
	
	
	private String Title;
	private int Price;
	static int Bookcount;
	private static int totalnumberofbook;
	
	//Static Block;
	static {
		int x=100;
		int y=230;
		int startwith= x+y;
		Bookcount=startwith;
	}
	
	
	public Book() {
		
		Title = "Squid Game";
		Price = 999;
		Bookcount++;
		totalnumberofbook++;
	
		
		
	}
	
	
	
	public Book(String Title , int Price) {
		
		super();
		this.Title=Title;
		this.Price=Price;
		Bookcount++;
		totalnumberofbook++;
		
	}
	
	public static int gettotalnumberofbooks(){
		return totalnumberofbook;
		
	}

	public Book(int price, String title) {
		super();
		Price = price;
		Title = title;
		Bookcount++;
		totalnumberofbook++;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	
	

}
