package ua.lviv.iot.tableware.model;

public class Bowl extends AbstractPlate {
	
	protected float deepInCm;
	
	public Bowl(long garanteeInDays, int priceInUAH, int priceInUAC, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material,TablewareType type,
			float diameterInCm, float deepInCm) {
		super(garanteeInDays, priceInUAH, priceInUAC, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour,
				dessignedFor, material,diameterInCm , type);
		this.deepInCm = deepInCm;
	}



}
