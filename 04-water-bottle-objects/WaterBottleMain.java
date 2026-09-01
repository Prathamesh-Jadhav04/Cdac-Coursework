
public class WaterBottleMain {

	public static void main(String[] args) {
		WaterBottle smallBottle = new WaterBottle();
		WaterBottle mediumBottle = new WaterBottle();
		WaterBottle largeBottle = new WaterBottle();
		
		smallBottle.make="Bisleri";
		smallBottle.volume=100;
		smallBottle.price=5.23f;
		
		System.out.println("Small WaterBottle Details\n");
		System.out.println("make:"+smallBottle.make);
		System.out.println("volume:"+smallBottle.volume);
		System.out.println("price:"+smallBottle.price);
		
		
		mediumBottle.make="Maaaza";
		mediumBottle.volume=200;
		mediumBottle.price=5.63f;
		
		
		System.out.println("midum WaterBottle Details\n");
		System.out.println("make:"+mediumBottle.make);
		System.out.println("volum:"+mediumBottle.volume);
		System.out.println("price:"+mediumBottle.price);
		
		
		
		
		largeBottle.make="fanta";
		largeBottle.volume=120;
		largeBottle.price=5.233f;
		
		
		System.out.println("large WaterBottle Details\n");
		System.out.println("make:"+largeBottle.make);
		System.out.println("volume:"+largeBottle.volume);
		System.out.println("price:"+largeBottle.price);
		
	
	}

}
