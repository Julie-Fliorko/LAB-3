package tableware.model;

public class PlanePlate extends AbstractPlate {
	public PlanePlate(long garanteeInDays, String style, HowToWash howToWash, int weightInGrams, boolean abilityToMicrowave,
			String manufacturer, String colour, String dessignedFor, String material, String type, float price,
			float diameterInCm, String shape) {
		super(garanteeInDays, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour, dessignedFor, material,
				type, price, diameterInCm);
		this.shape = shape;
	}
	protected String shape;

	

	protected String getShape() {
		return shape;
	}
	protected void setShape(String shape) {
		this.shape = shape;
	}

}
