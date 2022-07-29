package com.example.hdds;

import org.springframework.stereotype.Component;

import com.example.interfaces.HDD;

@Component("Hitachi")
public class Hitachi implements HDD {
	public String storage() {
		return "Hitachi HDD";
	}
}
