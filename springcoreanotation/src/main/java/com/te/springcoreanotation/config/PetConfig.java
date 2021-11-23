package com.te.springcoreanotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreanotation.beans.Kong;
import com.te.springcoreanotation.beans.Lion;
import com.te.springcoreanotation.beans.Pet;
import com.te.springcoreanotationinterface.Animal;

@Configuration
public class PetConfig {
	
	@Bean
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("King");
		return pet;
		
	}
	
	@Bean("lion")
	public Animal getLion() {
		return new Lion();
	}

	@Bean("kong")
	public Animal getKong() {
		return new Kong();
	}
}
