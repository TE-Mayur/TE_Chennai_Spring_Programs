package com.te.springcoreanotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreanotation.beans.MobileCompany;

@Configuration
public class MoblieConfig {
	
	@Bean
	public MobileCompany getMC() {
		return 
				new MobileCompany("Android", "Rog", 8, "Asus", 5000);
	}
}
