package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

	@Bean
	public String init() {
		return "Success..";
	}
	
	@Bean
	@Scope("prototype") // a new object is created every time this is called
	public String anotherBean() {
		return "Another Bean";
	}
}