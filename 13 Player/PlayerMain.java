
public class PlayerMain {

	public static void main(String[] args) {
		CricketPlayer crPlayer = new CricketPlayer();
		crPlayer.setName("Virat Kohli");;crPlayer.setAge(35);
		crPlayer.setRuns(18000);
		System.out.println(crPlayer.getName());
		System.out.println(crPlayer.getAge());
		System.out.println(crPlayer.getRuns());
		System.out.println("\n\n\n\n\n\n\n");
		
		CricketPlayer crPlayer2 = new CricketPlayer("Rohit Sharma",36,14565);
		System.out.println(crPlayer2.getName());
		System.out.println(crPlayer2.getAge());
		System.out.println(crPlayer2.getRuns());
		
		
		
		
	}

}
