package com.te.springcoreanotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.te.springcoreanotation.beans.EmployeeBean;

@Configuration
public class EmployeeConfig {

	@Bean(name = "defltcons")
	@Scope("prototype")
	public EmployeeBean getEmpBean() {
		return new EmployeeBean();
	}
	
	@Bean(name = "setid")
//	@Primary
	public EmployeeBean getEmpWithValues() {
		EmployeeBean bean = new EmployeeBean();
		bean.setId(20);
		bean.setName("King Kong");
		bean.setRole("Animal");
		return bean;
	}
	
//	@Bean(name = "paraCons")
//	public EmployeeBean getEmpParaCon() {
//		return new EmployeeBean(300,"Sunny","Actor");
//	}
}
