
public class RupeeToPoundConverter implements CurrencyConverter {

	@Override
	public float doConvert(float mountInIndianRupees) {
		float amountInPounds = mountInIndianRupees / POUND_TO_RUPEE;
		return amountInPounds;
		
	}

}
