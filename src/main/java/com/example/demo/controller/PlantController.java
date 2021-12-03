package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.model.Plant;
import com.example.demo.data.service.PlantService;

@RestController
@RequestMapping(path = "/plant")

public class PlantController {
	private PlantService service;

	// Plant Controller constructor
	public PlantController(PlantService service) {
		this.service = service;
	}

	// IG-1 Feature-Create control
	@PostMapping("/add")
	public ResponseEntity<Plant> addPlant(@RequestBody Plant plant) {
		return new ResponseEntity<Plant>(this.service.addPlant(plant), HttpStatus.CREATED);
	}

	// IG-3 Feature-Get-All control
	@GetMapping("/all")
	public ResponseEntity<List<Plant>> getAllPlants() {
		return new ResponseEntity<List<Plant>>(this.service.getAllPlants(), HttpStatus.OK);
	}

}