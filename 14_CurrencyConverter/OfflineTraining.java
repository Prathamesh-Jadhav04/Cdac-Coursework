
public class OfflineTraining extends Training {
	private String venueDetails;

	public OfflineTraining() {
		
		}

	public OfflineTraining(String moduleName, int duration, String venueDetails) {
		super(moduleName, duration);
		this.venueDetails = venueDetails;
	}

	public String getVenueDetails() {
		return venueDetails;
	}

	public void setVenueDetails(String venueDetails) {
		this.venueDetails = venueDetails;
	}
	@Override
	public void conductTraing() { //Methood overridden
		System.out.println("Conducting a Training on "+this.getModuleName());
		System.out.println("for "+this.getDuration()+" days");
		System.out.println("at "+venueDetails);
	}
	@Override
	public String getDetails() {
		String details = super.getDetails();
		return details+"\nVenue:- "+venueDetails;
	}
	
	
	
}
