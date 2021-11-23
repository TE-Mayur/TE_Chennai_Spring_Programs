package com.te.springcoreanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreanotation.beans.Bike;
import com.te.springcoreanotation.config.EngineConfig;

public class BikeTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EngineConfig.class);
		
		Bike bike = context.getBean(Bike.class);
		
		System.out.println(bike.getEngine().getEngineType());
		System.out.println(bike.getEngine().getCc());
		System.out.println(bike.getEngine().getRpm());
	
	
		System.out.println(bike.getCompany().getName());
		System.out.println(bike.getCompany().getModel());
		
	
	}
}
	