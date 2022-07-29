package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Wood;

@SpringBootApplication
public class LombokExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokExampleApplication.class, args);
		
		Wood w = new Wood();
		w.setColour("Blue");
		
		System.out.println(w.toString());
	}

}
