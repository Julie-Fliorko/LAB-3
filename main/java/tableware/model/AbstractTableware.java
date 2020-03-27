package tableware.model;

public abstract class AbstractTableware {

	protected long garanteeInDays;
	protected int weightInGrams;
	protected String style;
	private HowToWash howToWash;
	protected boolean abilityToMicrowave;
	protected String manufacturer;
	protected String colour;
	protected String dessignedFor;
	protected String material;
	protected String tablewareType;
	// public TablewareType tablewareType;
	protected float price;

	AbstractTableware(long garanteeInDays, String style, HowToWash howToWash, int weightInGrams,
			boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material,
			String tablewareType, float price) {
		this.garanteeInDays = garanteeInDays;
		this.style = style;
		this.weightInGrams = weightInGrams;
		this.abilityToMicrowave = abilityToMicrowave;
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.dessignedFor = dessignedFor;
		this.material = material;
		this.price = price;
		this.tablewareType = tablewareType;
		this.abilityToMicrowave = abilityToMicrowave;
		this.howToWash = howToWash;
	}

	public long getGaranteeInDays() {
		return garanteeInDays;
	}

	public void setGaranteeInDays(long garanteeInDays) {
		this.garanteeInDays = garanteeInDays;
	}

	public int getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public boolean getAbilityToMicrowave() {
		return abilityToMicrowave;
	}

	public void setAbilityToMicrowave(boolean abilityToMicrowave) {
		this.abilityToMicrowave = abilityToMicrowave;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColour() {
		return colour;
	}

	public void setClolour(String colour) {
		this.colour = colour;
	}

	public String getDessignedFor() {
		return dessignedFor;
	}

	public void setDessignedFor(String dessignedFor) {
		this.dessignedFor = dessignedFor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public HowToWash getHowToWash() {
		return howToWash;
	}

	public void setHowToWash(HowToWash howToWash) {
		this.howToWash = howToWash;
	}

	public String getTablewareType() {
		return tablewareType;
	}

	public void setTablewareType(String tablewareType) {
		this.tablewareType = tablewareType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getHeaders() {
		return "garanteeInDays, weightInGrams, abilityToMicrowave, manufacturer, colour, dessignedFor,"
				+ " material, howToWash, tablewareType, price ";

	}
	
	public String toCSV() {
		return "GaranteeInDays: " + garanteeInDays + ", weightInGrams: " + weightInGrams + ", abilityToMicrowave: " + 
	", manufacturer: " + manufacturer + ", colour: " + colour + ", dessignedFor: " + dessignedFor + ", material: " + material
	+ ", howToWash: " + howToWash + ", tablewareType: " + tablewareType + ", price" + price;
		
	}
}
