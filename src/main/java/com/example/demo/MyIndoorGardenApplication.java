package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyIndoorGardenApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MyIndoorGardenApplication.class, args);
		
		//Method name is the name of the Bean method
		String s = ac.getBean("init").toString();
		System.out.println(s);
	}

}
