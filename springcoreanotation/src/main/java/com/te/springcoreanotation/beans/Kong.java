package com.te.springcoreanotation.beans;

import com.te.springcoreanotationinterface.Animal;

public class Kong implements Animal{

	@Override
	public void eat() {
		System.out.println("Kong is eating fish");
	}

	@Override
	public void sound() {
		System.out.println("Kong is snoaring");
	}

	@Override
	public void type() {
		System.out.println("Kong is Omnivorus");
	}
	
	

}
