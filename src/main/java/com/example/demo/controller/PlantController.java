package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	// Feature-Get-By-Id control
	@GetMapping("{id}")
	public ResponseEntity<Plant> getPlantById(@PathVariable Integer id) {
		return new ResponseEntity<Plant>(this.service.getPlantById(id), HttpStatus.FOUND);
	}

	// IG-4 Feature-Edit control
	@PutMapping("/edit/{id}")
	public ResponseEntity<Plant> editPlant(@RequestBody Plant plant, @PathVariable Integer id) {
		return new ResponseEntity<Plant>(this.service.editPlant(plant, id), HttpStatus.ACCEPTED);
	}
	
	// IG-5 Feature-Delete control
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deletePlant(@PathVariable Integer id){
		boolean deleteCheck = this.service.deletePlant(id);
		if (deleteCheck) {
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}