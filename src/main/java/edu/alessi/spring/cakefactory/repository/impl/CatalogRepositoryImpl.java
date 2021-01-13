package edu.alessi.spring.cakefactory.repository.impl;

import static edu.alessi.spring.cakefactory.misc.ImmutableUtils.immutableList;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import edu.alessi.spring.cakefactory.io.ProductConstraints;
import edu.alessi.spring.cakefactory.model.Product;
import edu.alessi.spring.cakefactory.model.ProductType;
import edu.alessi.spring.cakefactory.repository.CatalogRepository;

/**
 * @see edu.alessi.spring.cakefactory.repository.CatalogRepository
 * 
 * @author Bruno Alessi
 * @since Jan 12, 2021
 */
@Repository
public class CatalogRepositoryImpl implements CatalogRepository {
	
	@Override
	public List<Product> findAllProducts() {
		long id = 1;
		return immutableList(
			//new Product(id++, "Yeast Bread",   199, "bread.jpg", ProductType.BREAD),
			//new Product(id++, "Nut Cookie",     99, null, 		 ProductType.COOKIE),
			//new Product(id++, "Vanilla Cake",  650, null, 		 ProductType.CAKE),
			//new Product(id++, "Fruit Cake",    650, null, 		 ProductType.CAKE),
			//new Product(id++, "Waffles",        99, null, 		 ProductType.PASTRY),
			//new Product(id++, "Apple Pie",     799, "pie.jpg", 	 ProductType.PIE),
			//new Product(id++, "Chocolate Pie", 699, null, 		 ProductType.PIE)
		    new Product(id++, "abcr", "All Butter Croissant", 75, null, ProductType.PASTRY),
		    new Product(id++, "ccr", "Chocolate Croissant", 95, null, ProductType.PASTRY),
		    new Product(id++, "b", "Fresh Baguette", 160, null, ProductType.BREAD),
		    new Product(id++, "rv", "Red Velvet", 395, null, ProductType.CAKE),
		    new Product(id++, "vs", "Victoria Sponge", 545, null, ProductType.CAKE),
		    new Product(id++, "cc", "Carrot Cake", 345, null, ProductType.CAKE)
		);
	}
	
	@Override
	public List<Product> findProductsByParameters(final ProductConstraints constraints) {
		if (constraints == null || (constraints.getMaxPrice() == ProductConstraints.UNCONSTRAINED_PRICE && constraints.getType() == null)) {
			return findAllProducts();
		}
		Predicate <Product> pred = p -> true;
		int priceLimit = constraints.getMaxPrice();
		if (priceLimit != ProductConstraints.UNCONSTRAINED_PRICE) {
			pred.and(p -> p.getPriceLeastMonetaryUnit() <= priceLimit);
		}
		ProductType pType = constraints.getType();
		if (pType != null) {
			pred.and(p -> pType == p.getType());
		}
		return findAllProducts().stream().filter(pred).collect(Collectors.toList());
	}

}
