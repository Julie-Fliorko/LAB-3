package tableware.model;

public class Glass extends AbstractDrinkingEquipment {
	protected boolean isFoot;
	protected float footHeigthInCm;

	public Glass(long garanteeInDays, String style, HowToWash howToWash, int weightInGrams, boolean abilityToMicrowave,
			String manufacturer, String colour, String dessignedFor, String material, String type, float price,
			int sizeInMl, float diameterInCm, boolean foot, float heigthInCm) {
		super(garanteeInDays, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour, dessignedFor,
				material, type, price, sizeInMl, diameterInCm);
		this.isFoot = foot;
		this.footHeigthInCm = heigthInCm;
	}

	public boolean isFoot() {
		return isFoot;
	}

	public void setFoot(boolean foot) {
		this.isFoot = foot;
	}

	public float getHeigthInCm() {
		return footHeigthInCm;
	}

	public void setHeigthInCm(float heigthInCm) {
		this.footHeigthInCm = heigthInCm;
	}
	
	public String getHeaders() {
		return super.getHeaders() + ", isFoot, footHeigthInCm";
	}
	
	public String toSCV() {
		return super.toCSV() + ", isFoot: " + isFoot + ", footHeigthInCm: " + footHeigthInCm;
	}

}
