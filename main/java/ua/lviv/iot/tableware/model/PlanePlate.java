package ua.lviv.iot.tableware.model;

public class PlanePlate extends AbstractPlate {
	
	protected String shape;
	
	public PlanePlate(long garanteeInDays, int priceInUAH, int priceInUAC, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material,TablewareType type,
			float diameterInCm, String  shape) {
		super(garanteeInDays, priceInUAH, priceInUAC, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour,
				dessignedFor, material, diameterInCm, type);
		this.shape = shape;
	}


}
