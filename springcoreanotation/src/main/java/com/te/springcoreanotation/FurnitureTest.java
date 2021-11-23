package com.te.springcoreanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreanotation.beans.Furniture;
import com.te.springcoreanotation.config.FurnitureConfig;

public class FurnitureTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(FurnitureConfig.class);
		Furniture furniture = context.getBean(Furniture.class);
		System.out.println(furniture.getMaterial());
		System.out.println(furniture.getThing());
		System.out.println(furniture.getName().getName());
	}
}
