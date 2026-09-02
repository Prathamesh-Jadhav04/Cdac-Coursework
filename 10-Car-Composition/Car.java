
public class Car {

	private String description;
	private int price;
	private Engine engineData;
	private MusicSystem musicSystemData;
	
	public Car() {
		
		description="Bwm M-series";
		price=9600000;
		engineData = new Engine();
		
		//not initializing musicSystemData because by default car dose not have it!';
	}

	public Car(String description, int price, Engine engineData, MusicSystem musicSystemData) {
		
		super();
		this.description = description;
		this.price = price;
		this.engineData = engineData;
		this.musicSystemData = musicSystemData;
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engine getEngineData() {
		return engineData;
	}

	public void setEngineData(Engine engineData) {
		this.engineData = engineData;
	}

	public MusicSystem getMusicSystemData() {
		return musicSystemData;
	}

	public void setMusicSystemData(MusicSystem musicSystemData) {
		this.musicSystemData = musicSystemData;
	}
	

}
