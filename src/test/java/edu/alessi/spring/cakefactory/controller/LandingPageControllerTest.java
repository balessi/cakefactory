package edu.alessi.spring.cakefactory.controller;

import static edu.alessi.spring.cakefactory.controller.LandingPageController.HOME_VIEW_NAME;
import static edu.alessi.spring.cakefactory.controller.LandingPageController.ROOT_PATH;
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
@WebMvcTest(LandingPageController.class)
public class LandingPageControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testMainPage() throws Exception {
		mockMvc.perform(get(ROOT_PATH))
			.andExpect(status().isOk())
			.andExpect(view().name(HOME_VIEW_NAME));
	}

}
