package edu.alessi.spring.cakefactory.service;

import java.util.List;

import edu.alessi.spring.cakefactory.io.DisplayedProduct;
import edu.alessi.spring.cakefactory.io.ProductConstraints;

/**
 * Services for searching and maintaining products
 * 
 * @author Bruno Alessi
 * @since Jan 11, 2021
 */
public interface CatalogService {

	List<DisplayedProduct> findAllProducts();
	
	List<DisplayedProduct> findProductsByParameters(final ProductConstraints constraints);
	
}
