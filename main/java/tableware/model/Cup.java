package tableware.model;

public class Cup extends AbstractTableware{
	public Cup(long garanteeInDays, String style, HowToWash howToWash, int weightInGrams, boolean abilityToMicrowave,
			String manufacturer, String colour, String dessignedFor, String material, String type, float price, String heandlesType) {
		super(garanteeInDays, style, howToWash, weightInGrams, abilityToMicrowave, manufacturer, colour, dessignedFor, material,
				type, price);
		this.heandlesType = heandlesType;
	}

	protected String heandlesType;

	public String getHeandlesType() {
		return heandlesType;
	}

	public void setHeandlesType(String heandlesType) {
		this.heandlesType = heandlesType;
	}
	
	public String getHeaders() {
		return super.getHeaders() + ", " + "heandlesType";
	}
	
	public String toCSV() {
		return super.toCSV() + ", heandlesType: " + heandlesType;
	}
}
