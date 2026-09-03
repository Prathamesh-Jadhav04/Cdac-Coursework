
public class TraingMain {

	public static void main(String[] args) {
		OfflineTraining offlineTrg = new OfflineTraining("OOP using java",9,"CDAC NASHIK");
		OnlineTraing onlineTrg = new OnlineTraing("SQL",9,"https://meet.com");
		
		offlineTrg.conductTraing();
		onlineTrg.conductTraing();
		
System.out.println("========================================================");
		
		Training trg = new OfflineTraining("Angular",5,"KGCE"); //parent child declaration
		//type conversion
		OfflineTraining trg2=(OfflineTraining)trg;
		trg2.setVenueDetails("SCOE");
		trg2.conductTraing();
		
		System.out.println("========================================================");
		
		System.out.println(onlineTrg.getDetails());
		System.out.println(offlineTrg.getDetails());
		
	}
	
		

}
