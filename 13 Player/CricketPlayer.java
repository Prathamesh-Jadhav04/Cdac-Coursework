
public class CricketPlayer extends Player {
	int runs;
	

	public CricketPlayer() {
		System.out.println("Inside Cricket Player()");
	}
	public CricketPlayer(String name,int age,int runs) {
		super(name,age);
		this.runs=runs;
		
	}
	
	

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
}
