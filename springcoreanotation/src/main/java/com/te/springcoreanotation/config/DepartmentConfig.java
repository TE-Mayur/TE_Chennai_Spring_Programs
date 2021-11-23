package com.te.springcoreanotation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreanotation.beans.Department;

@Configuration
public class DepartmentConfig {

	@Bean("deve")
	public Department getDepartmentDevelops() {
		return new Department(320, "Develops");
	}
	
	@Bean("test")
	public Department getDepartmentTest() {
		return new Department(450, "Tester");
	}
	
	@Bean("hr")
	public Department getDepartmentHR() {
		return new Department(550, "HR");
	}
}