package com.te.springcoreanotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreanotation.beans.Brand;
import com.te.springcoreanotation.beans.Furniture;

@Configuration
public class FurnitureConfig {

	@Bean("bed")
	public Furniture getFunBed() {
		Furniture furniture = new Furniture();
		furniture.setThing("Bed");
		furniture.setMaterial("Wood");
		return furniture;
	}

	@Bean("chair")
	public Brand getBrand() {
		return new Brand("peacock");
	}
}
