package edu.alessi.spring.cakefactory.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author Bruno Alessi
 * @since Jan 3, 2021
 */
/*
 * @WebMvcTest is a special test annotation provided by Spring Boot that arranges for the test to run
 * in the context of a Spring MVC application. More specifically, in this case, it arranges for
 * this controller to be registered in Spring MVC so that you can throw requests against it.
 */
@WebMvcTest(LandingPageController.class)
public class LandingPageControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testMainPage() throws Exception {
		mockMvc.perform(get(LandingPageController.ROOT_PATH)) // performs GET request to ROOT_PATH
			.andExpect(status().isOk()) // expects HTTP 200
			.andExpect(view().name(LandingPageController.VIEW_NAME)); // expects the home view
	}

}
