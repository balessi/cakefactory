package edu.alessi.spring.cakefactory.io;

import edu.alessi.spring.cakefactory.model.ProductType;
import lombok.Data;

/**
 * This encapsulates search constraints used for finding products
 * 
 * @author Bruno Alessi
 * @since Jan 11, 2021
 */
@Data
public class ProductConstraints {
	
	public static final int UNCONSTRAINED_PRICE = Integer.MIN_VALUE;

	private ProductType type;
	private int maxPrice = UNCONSTRAINED_PRICE;
	
}
