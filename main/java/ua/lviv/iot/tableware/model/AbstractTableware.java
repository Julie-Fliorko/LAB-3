package ua.lviv.iot.tableware.model;


public abstract class AbstractTableware {
	protected long garanteeInDays;
	protected int priceInUAH;
	protected int priceInUAC;
	protected int weightInGrams;
	protected String style;
	private HowToWash howToWash;
	protected boolean abilityToMicrowave;
	protected String manufacturer;
	protected String colour;
	protected String dessignedFor;
	protected String material;
	public TablewareType type;

	public AbstractTableware(long garanteeInDays, int priceInUAH, int priceInUAC, String style, HowToWash howToWash, int weightInGrams, boolean abilityToMicrowave, String manufacturer, String colour, String dessignedFor, String material, TablewareType type ){
		this.garanteeInDays = garanteeInDays;
		this.priceInUAH = priceInUAH;
		this.priceInUAC = priceInUAC;
		this.style = style;
		this.weightInGrams = weightInGrams;
		this.abilityToMicrowave = abilityToMicrowave;
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.dessignedFor = dessignedFor;
		this.material = material;
	}
	
	public long getGaranteeInDays() {
		return garanteeInDays;
	}
	public void setGaranteeInDays(long garanteeInDays) {
		this.garanteeInDays = garanteeInDays;
	}
	
	public int priceInUAH() {
		return priceInUAH;
	}
	public void setPriceInUAH(int priceInUAH) {
		this.priceInUAH = priceInUAH;
	}
	
	public int getPriceInUAC() {
		return priceInUAC;
	}
	public void setPriceInUAC(int priceInUAC) {
		this.priceInUAC = priceInUAC;
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
	
	public TablewareType getTablewareType() {
		return type;
	}
	public void setTablewareType(TablewareType type) {
		this.type = type;
	}
}
