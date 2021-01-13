package edu.alessi.spring.cakefactory.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.alessi.spring.cakefactory.io.DisplayedProduct;
import edu.alessi.spring.cakefactory.io.ProductConstraints;
import edu.alessi.spring.cakefactory.repository.CatalogRepository;
import edu.alessi.spring.cakefactory.service.CatalogService;
import lombok.extern.slf4j.Slf4j;

/**
 * @see edu.alessi.spring.cakefactory.service.CatalogService
 * 
 * @author Bruno Alessi
 * @since Jan 11, 2021
 */
@Slf4j
@Service
public class CatalogServiceImpl implements CatalogService {

	private CatalogRepository repo;
	
	public CatalogServiceImpl(CatalogRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<DisplayedProduct> findAllProducts() {
		log.debug("Finding all products");
		return DisplayedProduct.convertToDisplayForm(repo.findAllProducts());
	}
	
	@Override
	public List<DisplayedProduct> findProductsByParameters(final ProductConstraints constraints) {
		log.debug("Finding products constrained by {}", constraints);
		return DisplayedProduct.convertToDisplayForm(repo.findProductsByParameters(constraints));
	}

}
