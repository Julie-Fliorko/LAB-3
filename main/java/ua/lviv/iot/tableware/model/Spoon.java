package ua.lviv.iot.tableware.model;

public class Spoon extends AbstractTableware{
	
	protected float heandleLengthInCm;
	
	public Spoon(long garanteeInDays, int priceInUAH, int priceInUAC, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material, float heandleLengthInCm,TablewareType type) {
		super(garanteeInDays, priceInUAH, priceInUAC, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour,
				dessignedFor, material,type);
		this.heandleLengthInCm = heandleLengthInCm;
	}
}
