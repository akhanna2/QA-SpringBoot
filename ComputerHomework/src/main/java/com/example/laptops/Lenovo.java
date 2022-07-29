package com.example.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.HDD;
import com.example.interfaces.Laptop;

@Component("myLenovo")
public class Lenovo implements Laptop{
	
	
	@Autowired
	@Qualifier("Hitachi")
	HDD hdd;
	
 public String config() {
	 return "This is a Lenovo laptop with a " + hdd.storage();
 }
}
