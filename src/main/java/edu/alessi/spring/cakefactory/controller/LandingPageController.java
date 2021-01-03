package edu.alessi.spring.cakefactory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * Controllers are the major players in Spring’s MVC framework.
 * Their primary job is to handle HTTP requests and either
 *   hand a request off to a view to render HTML (browser-displayed) or
 *   write data directly to the body of a response (RESTful)
 *   
 * @author Bruno Alessi
 * @since Jan 3, 2021
 */
@Slf4j
@Controller
public class LandingPageController {

	public static final String ROOT_PATH = "/";
	public static final String HOME_VIEW_NAME = "index";
	
	/**
	 * Handle requests for the ROOT_PATH
	 * 
	 * @param model A holder for attributes that will be accessed in the view
	 * @return The logical name of the view that will be used to render the model to the browser
	 */
	@GetMapping(ROOT_PATH)
	public String showMainPage(Model model) {
		log.debug("Handling path \"{}\" to render {}... ", ROOT_PATH, HOME_VIEW_NAME);
		return HOME_VIEW_NAME;
	}
	
}
