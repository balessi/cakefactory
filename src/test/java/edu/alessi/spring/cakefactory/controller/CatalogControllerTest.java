package edu.alessi.spring.cakefactory.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * 
 * @author Bruno Alessi
 * @since Jan 13, 2021
 */
@WebMvcTest(CatalogControllerTest.class)
public class CatalogControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testCatalog() throws Exception {
		mockMvc.perform(get(CatalogController.ROOT_PATH)) // performs GET request to ROOT_PATH
			.andExpect(status().isOk()) // expects HTTP 200
			.andExpect(view().name(CatalogController.VIEW_NAME)); // expects the home view
	}

}
