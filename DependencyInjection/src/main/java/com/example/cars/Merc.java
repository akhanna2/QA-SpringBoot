package com.example.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.interfaces.Car;

@Component("myMerc")
public class Merc implements Car{
	
	@Autowired
	Engine eng;
	
	public String spec() {
		return "This is a Merc with a " + eng.type + " engine";
	}
	}
