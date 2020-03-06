package ua.lviv.iot.tableware.model;

public class AbstractPlate extends AbstractTableware {

	protected float diameterInCm; 
	
	public AbstractPlate(long garanteeInDays, int priceInUAH, int priceInUAC, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material, float diameterInCm, TablewareType type) {
		super(garanteeInDays, priceInUAH, priceInUAC, style,howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour,
				dessignedFor, material, type);
		this.diameterInCm = diameterInCm;
	}

	public float setDiameterInCm() {
		return diameterInCm;
	}
	public void getDiameterInCm( float diameterInCm) {
		this.diameterInCm = diameterInCm;
	}
}
