package edu.alessi.spring.cakefactory.model;

/**
 * 
 * @author Bruno Alessi
 * @since Jan 11, 2021
 */
public enum ProductType {
	
	BREAD("Bread", "Breads"),
	COOKIE("Cookie", "Cookies"),
	CAKE("Cake", "Cakes"),
	PASTRY("Pastry", "Pastries"),
	PIE("Pie", "Pies");
	
	private String singular;
	private String plural;
	
	ProductType(String singular, String plural) {
		this.singular = singular;
		this.plural = plural;
	}

	public String singular() {
		return this.singular;
	}

	public String plural() {
		return this.plural;
	}

}
