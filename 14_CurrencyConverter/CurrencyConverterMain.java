
public class CurrencyConverterMain {

	public static void main(String[] args) {
		CurrencyConverter forex;
		forex = new DollarToRupeeConverter();
		
		float inr =forex.doConvert(5000);
		System.out.println("$5000 = Rs "+inr);
		System.out.println("============================================");
		
		forex = new RupeeToPoundConverter();
		float pon = forex.doConvert(2575000);
		System.out.println("Rs.2575000 = GBP "+pon);
	}

}
