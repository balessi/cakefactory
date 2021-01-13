package edu.alessi.spring.cakefactory.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

/**
 * Bare data of goods sold at Ana's Bakery
 * 
 * @author Bruno Alessi
 * @since Jan 9, 2021
 */
@Data
public class Product {

	private final long id;
	
	@EqualsAndHashCode.Exclude
	@NonNull
	private final String abbreviation;
	
	@EqualsAndHashCode.Exclude
	@NonNull
	private final String name;

	@EqualsAndHashCode.Exclude
	private final int priceLeastMonetaryUnit;
	
	@EqualsAndHashCode.Exclude
	private final String imageFile;
	
	@EqualsAndHashCode.Exclude
	@NonNull
	private final ProductType type;
	
}
