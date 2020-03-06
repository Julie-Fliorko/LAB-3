package ua.lviv.iot.tableware.model;

public class Glass extends AbstractDrinkEquipment{
	
	protected boolean foot;
	protected float heightInCm;
	
	public Glass(long garanteeInDays, int priceInUAH, int priceInUAC, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material,
			int sizeInMl, float diameterInCm, boolean foot, float heightInCm, TablewareType type ) {
		super(garanteeInDays, priceInUAH, priceInUAC, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour,
				dessignedFor, material, sizeInMl, diameterInCm, type);
		this.foot = foot;
		this.heightInCm = heightInCm;
	}
	
}
