package com.example;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Computer {
	
	@Size(min= 4, max= 10)
	private String brand;
	
	@Max(2)
	private int warranty;
	
	@Min(8)
	@NotNull
	private int minRam;

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", warranty=" + warranty + ", minRam=" + minRam + "]";
	}
	
	

}
