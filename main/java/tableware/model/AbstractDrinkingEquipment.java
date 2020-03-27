package tableware.model;

public abstract class AbstractDrinkingEquipment extends AbstractTableware{
	protected int sizeInMl;
	protected float diameterInCm;
	public AbstractDrinkingEquipment(long garanteeInDays, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material,
			String type, float price, int sizeInMl, float diameterInCm) {
		super(garanteeInDays, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour, dessignedFor, material,
				type, price);
		this.sizeInMl = sizeInMl;
		this.diameterInCm = diameterInCm;
	}
	public int getSizeInMl() {
		return sizeInMl;
	}
	public void setSizeInMl(int sizeInMl) {
		this.sizeInMl = sizeInMl;
	}
	public float getDiameterInCm() {
		return diameterInCm;
	}
	public void setDiameterInCm(float diameterInCm) {
		this.diameterInCm = diameterInCm;
	}	
	
	public String getHeaders() {
		return super.getHeaders() + "," + "sizeInMl, diameterInCm";
	}
	
	public String toCSV() {
		return super.toCSV() + ", sizeInMl: " + sizeInMl + ", diameterInCm: " + diameterInCm;
	}
}
