package com.example.demo.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id; // this is the primary key in a MySql DB
	private String name;
	private Integer quantity;
	private String colour;
	private String countryOfOrigin;
	private Integer wateringFrequency;// in days
	
	public Plant() {
	}
	
	public Plant(Integer id, String name, Integer quantity, String colour, String countryOfOrigin,
			Integer wateringFrequency) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.colour = colour;
		this.countryOfOrigin = countryOfOrigin;
		this.wateringFrequency = wateringFrequency;
	}

	public Plant(String name, Integer quantity, String colour, String countryOfOrigin, Integer wateringFrequency) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.colour = colour;
		this.countryOfOrigin = countryOfOrigin;
		this.wateringFrequency = wateringFrequency;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public Integer getWateringFrequency() {
		return wateringFrequency;
	}

	public void setWateringFrequency(Integer wateringFrequency) {
		this.wateringFrequency = wateringFrequency;
	}
}
