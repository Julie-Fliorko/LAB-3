package ua.lviv.iot.tableware.model;

public class Knife extends AbstractTableware{

	protected String bladeType;
	protected String sharpness;
	protected float bladeLengthInCm;
	
	public Knife(long garanteeInDays, int priceInUAH, int priceInUAC, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material,TablewareType type,String bladeType, String sharpness, float bladeLengthInCm) {
		super(garanteeInDays, priceInUAH, priceInUAC, style,howToWash , weightInGrams, abilityToMicrowave, manufacturer, colour,
				dessignedFor, material, type);
		this.bladeType = bladeType;
		this.sharpness = sharpness;
		this.bladeLengthInCm = bladeLengthInCm;
	}
	
}
