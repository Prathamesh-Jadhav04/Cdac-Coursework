
public class CarMain {

	public static void main(String[] args) {
		  Car simpleCar,premiumCar;
		  
		  /* simple car dose not have MusicSystem and it has a Engine with Basic Specification;
		   Primium car has MusicSystem and it has a powerful Engine Specification
		   */
		  
		  simpleCar=new Car();
		  System.out.println(simpleCar.getDescription());
		  System.out.println(simpleCar.getPrice());
		  
		  //print power of engine Install in simplecar;
		  
		  
		  //1. Using Explicit Reference;
		  //obtain the engine installed in simple car;
		  
		  Engine simpleEngine=simpleCar.getEngineData();
		  String simplePower=simpleEngine.getPower();
		  System.out.println(simplePower);
		  
		  
		  //2.using Object Graph Navigation;
		  
		 System.out.println(simpleCar.getEngineData().getPower());
		 
		 System.out.println("*********************************************");
		 
		 
		 
		 Engine premiumEngine=new Engine("Disel","4000cc");
		 MusicSystem premiumMusicSystem=
				 new MusicSystem("sony", "Dolby with 3d sound");
		 
		 premiumCar=new Car("Lamborginii",973879743,premiumEngine,premiumMusicSystem);
		 System.out.println(premiumCar.getDescription());
		 System.out.println(premiumCar.getPrice());
		 
		 //print power of engine Install in premiumcar;
		 
		 System.out.println(premiumCar.getEngineData().getPower());
		 
		 //print sound Effect of music install in premiumcar;
		 
		 System.out.println(premiumCar.getMusicSystemData().getSoundEffect());
		 

		 
		 MusicSystem currentMusicSystem=simpleCar.getMusicSystemData()	;
		 if(currentMusicSystem!=null) {
			String currentSoundEffect=
			 currentMusicSystem.getSoundEffect();
			 System.out.println(currentSoundEffect);
		 }
		 
		 else
			 System.out.println("This Car Dose Not Have Any Prior Music System Installed");
		 
		 
	}

}
