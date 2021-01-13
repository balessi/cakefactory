package edu.alessi.spring.cakefactory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * Controllers are the major players in Spring’s MVC framework.
 * Their primary job is to handle HTTP requests and either
 *   hand a request off to a view to render HTML (browser-displayed) or
 *   write data directly to the body of a response (RESTful webservice)
 *   
 * @author Bruno Alessi
 * @since Jan 3, 2021
 */
@Slf4j
@Controller
@RequestMapping(LandingPageController.ROOT_PATH)
public class LandingPageController {

	public static final String ROOT_PATH = "/";
	public static final String VIEW_NAME = "index";
	
	/**
	 * Handle requests for the ROOT_PATH
	 * 
	 * @return The logical name of the view that will be used to render the model to the browser. The resulting path will be /templates/<logical_name>.html 
	 */
	@GetMapping()
	public String showMainPage() {
		log.debug("Handling path {} to render {}... ", ROOT_PATH, VIEW_NAME);
		return VIEW_NAME;
	}
	
}
