package ua.lviv.iot.tableware.model;

public class Fork extends AbstractTableware {
	
	protected float heandleLengthInCm;
	
	public Fork(long garanteeInDays, int priceInUAH, int priceInUAC, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material,TablewareType type, float heandleLengthInCm) {
		super(garanteeInDays, priceInUAH, priceInUAC, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour,
				dessignedFor, material, type);
		this.heandleLengthInCm = heandleLengthInCm;
	}
}
