package edu.alessi.spring.cakefactory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.alessi.spring.cakefactory.service.CatalogService;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Bruno Alessi
 * @since Jan 11, 2021
 */
@Slf4j
@Controller
@RequestMapping(CatalogController.ROOT_PATH)
public class CatalogController {
	
	/*
		I want to see a page with a list of available pastries
		So that I can decide what I want to order.
		
		Acceptance criteria:
			Given I have 6 items imported to the database (see `data.sql`)
			When I navigate to the home page
			Then I see a list of all 6 items with title and price
			Note: Display price in £X.XX format
	*/
	
	public static final String ROOT_PATH = "/catalog";
	public static final String VIEW_NAME = "catalog";
	public static final String PRODS_ATTR = "products";
	
	private CatalogService service;

	public CatalogController(CatalogService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	public String showCatalog(Model model) {
		log.debug("Handling path {} to render {}...", ROOT_PATH, VIEW_NAME);
		model.addAttribute(PRODS_ATTR, service.findAllProducts());
		//model.addAttribute("types", EnumSet.allOf(ProductType.class));
		//model.addAttribute("selectedProduct", new ProductConstraints());
		return VIEW_NAME;
	}

}
