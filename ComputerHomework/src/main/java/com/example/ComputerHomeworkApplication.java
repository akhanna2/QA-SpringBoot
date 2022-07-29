package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.interfaces.Laptop;

//@SpringBootApplication
public class ComputerHomeworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ComputerHomeworkApplication.class, args);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Laptop myLaptop = context.getBean("myDell", Laptop.class);
		System.out.println(myLaptop.config());
		
		Laptop myLaptop1 = context.getBean("myLenovo", Laptop.class);
		System.out.println(myLaptop1.config());
		
	}

}
