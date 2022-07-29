package com.example.types;

import org.springframework.stereotype.Component;

import com.example.interfaces.EngineInterface;

@Component("V8")
public class V8 implements EngineInterface {
	public String type() {
		return "V8i";
	}
}
