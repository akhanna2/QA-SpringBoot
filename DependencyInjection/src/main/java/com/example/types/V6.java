package com.example.types;

import org.springframework.stereotype.Component;

import com.example.interfaces.EngineInterface;

@Component("V6")
public class V6 implements EngineInterface {
	public String type() {
		return "V6i";
	}
}
