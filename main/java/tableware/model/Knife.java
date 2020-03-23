package tableware.model;

public class Knife extends AbstractTableware{
	
	
	public Knife(long garanteeInDays, String style, HowToWash howToWash, int weightInGrams, boolean abilityToMicrowave,
			String manufacturer, String colour, String dessignedFor, String material, String type, float price, String bladeType, String sharpness, float bladeLeangthInCm) {
		super(garanteeInDays, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour, dessignedFor, material,
				type, price);
		this.bladeType = bladeType;
		this.sharpness = sharpness;
		this.bladeLeangthInCm = bladeLeangthInCm;
	}
	protected String bladeType;
	protected String sharpness;
	protected float bladeLeangthInCm;
	
	public String getBladeType() {
		return bladeType;
	}
	public void setBladeType(String bladeType) {
		this.bladeType = bladeType;
	}
	public String getSharpness() {
		return sharpness;
	}
	public void setSharpness(String sharpness) {
		this.sharpness = sharpness;
	}
	public float getBladeLeangthInCm() {
		return bladeLeangthInCm;
	}
	public void setBladeLeangthInCm(float bladeLeangthInCm) {
		this.bladeLeangthInCm = bladeLeangthInCm;
	}
}