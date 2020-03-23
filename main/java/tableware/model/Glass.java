package tableware.model;

public class Glass extends AbstractDrinkingEquipment{
	protected boolean foot;
	protected float heigthInCm;
	
	public Glass(long garanteeInDays, String style, HowToWash howToWash, int weightInGrams, boolean abilityToMicrowave,
			String manufacturer, String colour, String dessignedFor, String material, String type, float price,
			int sizeInMl, float diameterInCm, boolean foot, float heigthInCm) {
		super(garanteeInDays, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour, dessignedFor, material,
				type, price, sizeInMl, diameterInCm);
		this.foot = foot;
		this.heigthInCm = heigthInCm;
	}

	public boolean isFoot() {
		return foot;
	}

	public void setFoot(boolean foot) {
		this.foot = foot;
	}

	public float getHeigthInCm() {
		return heigthInCm;
	}

	public void setHeigthInCm(float heigthInCm) {
		this.heigthInCm = heigthInCm;
	}



	
}
