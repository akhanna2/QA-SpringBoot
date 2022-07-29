package com.example.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.Car;
import com.example.interfaces.EngineInterface;

//@Component("myBMW")
public class BMW implements Car {
	
	@Autowired
	@Qualifier("V6")
	EngineInterface eng;
	
	public String spec() {
		return "This is a BMW with a " + eng.type() + " engine";
	}
}
