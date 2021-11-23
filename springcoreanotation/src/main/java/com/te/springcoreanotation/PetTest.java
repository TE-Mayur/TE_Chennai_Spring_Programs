package com.te.springcoreanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreanotation.beans.Pet;
import com.te.springcoreanotation.config.PetConfig;

public class PetTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		
		Pet pet = context.getBean(Pet.class);
		
		System.out.println(pet.getName());
		pet.getAnimal().eat();
		pet.getAnimal().sound();
		pet.getAnimal().type();
		
	}
}
