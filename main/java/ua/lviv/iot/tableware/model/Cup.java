package ua.lviv.iot.tableware.model;

public class Cup extends AbstractDrinkEquipment {
	
	protected String heandlessType;
	
	public Cup(long garanteeInDays, int priceInUAH, int priceInUAC, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material,
			int sizeInMl, float diameterInCm,TablewareType type, String heandlessType ) {
		super(garanteeInDays, priceInUAH, priceInUAC, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour,
				dessignedFor, material, sizeInMl, diameterInCm, type);
		this.heandlessType = heandlessType;
	}
}
