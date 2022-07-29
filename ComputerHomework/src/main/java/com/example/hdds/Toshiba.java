package com.example.hdds;

import org.springframework.stereotype.Component;

import com.example.interfaces.HDD;


@Component("Toshiba")
public class Toshiba implements HDD{
	public String storage() {
		return "Toshiba HDD";
	}
}
