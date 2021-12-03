package com.example.demo.data.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.data.model.Plant;
import com.example.demo.data.repository.PlantRepo;

@Service
public class PlantService {

	private PlantRepo repo;

	// PlantService constructor
	public PlantService(PlantRepo repo) {
		this.repo = repo;
	}

	// IG-1-Feature-Create Plant method
	public Plant addPlant(Plant plant) {
		// Add new Plant and return it
		return this.repo.save(plant);
	}

	// IG-3 Feature-Get-All method
	public List<Plant> getAllPlants() {
		return this.repo.findAll();
	}

}
