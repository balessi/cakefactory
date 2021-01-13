package edu.alessi.spring.cakefactory.repository;

import java.util.List;

import edu.alessi.spring.cakefactory.io.ProductConstraints;
import edu.alessi.spring.cakefactory.model.Product;

/**
 * Services for searching and maintaining products
 * 
 * @author Bruno Alessi
 * @since Jan 12, 2021
 */
public interface CatalogRepository {

	List<Product> findAllProducts();
	
	List<Product> findProductsByParameters(final ProductConstraints constraints);

}
