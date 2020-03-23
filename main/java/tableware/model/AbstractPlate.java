package tableware.model;

public abstract class AbstractPlate extends AbstractTableware{
	protected float diameterInCm;
	
	AbstractPlate(long garanteeInDays, String style, HowToWash howToWash, int weightInGrams, boolean abilityToMicrowave,
			String manufacturer, String colour, String dessignedFor, String material, String type, float price, float diameterInCm) {
		super(garanteeInDays, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour, dessignedFor, material,
				type, price);
		this.diameterInCm = diameterInCm;
	}

	




	public float getDiameterInCm() {
		return diameterInCm;
	}

	public void setDiameterInCm(float diameterInCm) {
		this.diameterInCm = diameterInCm;
	}
	
}
/*	
	public AbstractPlate(long garanteeInDays, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material,
			TablewareType tablewareType, float price,
			int diameterInCm) {
		super(garanteeInDays, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour, dessignedFor, material, tablewareType, price);
		*/