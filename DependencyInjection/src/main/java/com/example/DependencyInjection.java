package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.cars.BMW;
import com.example.cars.Merc;
import com.example.interfaces.Car;

//@SpringBootApplication
public class DependencyInjection {

	public static void main(String[] args) {
		//ApplicationContext context = SpringApplication.run(DependencyInjection.class, args);
		
		/*
		BMW b = new BMW();
		Merc m = new Merc();
		
		System.out.println(b.spec());
		System.out.println(m.spec());
		*/
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("myBMW", Car.class);
		System.out.println(myCar.spec());
		
		Car myCar1 = context.getBean("myMerc", Car.class);
		System.out.println(myCar1.spec());
	}

}
