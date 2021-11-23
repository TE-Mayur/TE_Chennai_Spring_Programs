package com.te.springcoreanotation.beans;

import com.te.springcoreanotationinterface.Animal;

public class Lion implements Animal{

	@Override
	public void eat() {
		System.out.println("Lion is eating meat");
	}

	@Override
	public void sound() {
		System.out.println("Lion is Roar");
	}

	@Override
	public void type() {
		System.out.println("Lion is Carnivorus");
	}
	
	

}
