package tableware.model;

public class Bowl extends AbstractPlate{
	public Bowl(long garanteeInDays, String style, HowToWash howToWash, int weightInGrams, boolean abilityToMicrowave,
			String manufacturer, String colour, String dessignedFor, String material, String type, float price,
			float diameterInCm, float depthInCm) {
		super(garanteeInDays, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour, dessignedFor, material,
				type, price, diameterInCm);
		this.depthInCm = depthInCm;
	}
	protected float depthInCm;
	

	protected float getDepthInCm () {
		return depthInCm;
	}
	protected void setDepthInCm(float depthInCm) {
		this.depthInCm = depthInCm;
	}

}
