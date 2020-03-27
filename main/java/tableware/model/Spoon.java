package tableware.model;

public class Spoon extends AbstractTableware{
	protected float heandleLengthInCm;
	Spoon(long garanteeInDays, String style, HowToWash howToWash, int weightInGrams, boolean abilityToMicrowave,
			String manufacturer, String colour, String dessignedFor, String material, String type, float price, float heandleLengthInCm) {
		super(garanteeInDays, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour, dessignedFor, material,
				type, price);
		this.heandleLengthInCm = heandleLengthInCm;
	}
	
	public String getHeaders() {
		return super.getHeaders() + ", heandleLengthInCm";
	}
	
	public String toCSV() {
		return super.toCSV() + ", heandleLengthInCm: " + heandleLengthInCm;
	}
}
