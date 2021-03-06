package com.example.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.example.demo.data.model.Plant;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:test-schema.sql",
		"classpath:test-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
public class PlantControllerIntegrationTest {
	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper mapper;

	@Test // Test for Feature-Create
	void createPlantTest() throws Exception {
		String testPlantAsJson = this.mapper
				.writeValueAsString(new Plant(null, "Sansevieria", 2, "yellow-green", "Congo", 14));
		String testPlantAsJsonResponse = this.mapper
				.writeValueAsString(new Plant(3, "Sansevieria", 2, "yellow-green", "Congo", 14));

		RequestBuilder request = post("/plant/add").contentType(MediaType.APPLICATION_JSON).content(testPlantAsJson);
		ResultMatcher status = status().isCreated();
		ResultMatcher content = content().json(testPlantAsJsonResponse);

		this.mvc.perform(request).andExpect(status).andExpect(content);
	}

	@Test // Test for Feature-Get-All
	void getAllPlantsTest() throws Exception {
		String listOfPlantsAsJSON = this.mapper
				.writeValueAsString(List.of(new Plant(1, "Sedum Morganianum", 2, "light green", "Mexico", 10),
						new Plant(2, "Monstera deliciosa", 1, "green", "Panama", 10)));

		RequestBuilder request = get("/plant/all");
		ResultMatcher status = status().isOk();
		ResultMatcher content = content().json(listOfPlantsAsJSON);

		this.mvc.perform(request).andExpect(status).andExpect(content);
	}

	@Test // Test for Read Car by ID
	void getPlantByIDTest() throws Exception {
		String testPlantAsJson = this.mapper
				.writeValueAsString(new Plant(1, "Sedum Morganianum", 2, "light green", "Mexico", 10));

		RequestBuilder request = get("/plant/1");
		ResultMatcher status = status().isFound();
		ResultMatcher content = content().json(testPlantAsJson);

		this.mvc.perform(request).andExpect(status).andExpect(content);
	}

	@Test // Test for Update
	void updatePlantTest() throws Exception {
		String testPlantAsJson = this.mapper
				.writeValueAsString(new Plant(1, "Sedum Morganianum", 5, "light green", "Mexico", 10));

		RequestBuilder request = put("/plant/edit/1").contentType(MediaType.APPLICATION_JSON).content(testPlantAsJson);
		ResultMatcher status = status().isAccepted();
		ResultMatcher content = content().json(testPlantAsJson);

		this.mvc.perform(request).andExpect(status).andExpect(content);
	}

	@Test // Test for Delete
	void deletePlantTest() throws Exception {
		RequestBuilder request = delete("/plant/delete/2");
		ResultMatcher status = status().isOk();

		this.mvc.perform(request).andExpect(status);
	}
}
