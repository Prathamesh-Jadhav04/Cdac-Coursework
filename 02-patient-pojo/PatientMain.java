
public class PatientMain {

	public static void main(String[] args) {
	Patient pt=new Patient();
	pt.setPatientId("P1");
	pt.setName("Kurotsuchii");
	pt.setBloodgroup("A+");
	pt.setHeight(174);
	pt.setWight(64);
	pt.setDiabetic(true);
	
	
	String ptName=pt.getName();
	boolean diabatic =pt.isDiabetic();
	
	
	if (diabatic)
	    System.out.println("Hello " + ptName + ", you need to start walking");
	else
	    System.out.println("Hi " + ptName + ", enjoy your sweets");
	
	}
}
