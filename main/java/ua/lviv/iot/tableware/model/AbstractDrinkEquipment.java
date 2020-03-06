package ua.lviv.iot.tableware.model;

public class AbstractDrinkEquipment extends AbstractTableware {

	protected int sizeInMl;
	protected float diameterInCm;

	
	public AbstractDrinkEquipment(long garanteeInDays, int priceInUAH, int priceInUAC, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material, int sizeInMl, float diameterInCm, TablewareType type) {
		super(garanteeInDays, priceInUAH, priceInUAC, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour,
				dessignedFor, material, type);
		this.sizeInMl = sizeInMl;
		this.diameterInCm = diameterInCm;
	}
	
}
