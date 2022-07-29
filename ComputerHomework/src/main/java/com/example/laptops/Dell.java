package com.example.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.HDD;
import com.example.interfaces.Laptop;

@Component("myDell")
public class Dell implements Laptop{
	
	@Autowired
	@Qualifier("Toshiba")
	HDD hdd;
	
 public String config() {
	 return "This is a Dell laptop with a " + hdd.storage();
 }
}
