package com.te.springcoreanotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreanotation.beans.EmployeeBean;

@Configuration
public class Employee2Config {

	@Bean
	public EmployeeBean getEmp() {
		EmployeeBean bean = new EmployeeBean();
		bean.setId(50);
		bean.setName("Godzilla");
		bean.setRole("Monster");
		return bean;
	}
	

}
