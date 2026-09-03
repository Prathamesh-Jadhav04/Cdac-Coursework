
public class Player {
	private String name;
	private int age;
	
	
	public Player() {
		System.out.println("Inside Player()");
		
	}
	
	public Player(String name, int age) {
		System.out.println("Inside Player(Sttring, Int)");
		this.name = name;
		this.age = age;
	}
	

	public Player(int age, String name) {
		System.out.println("Inside Player( Int, String)");
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
