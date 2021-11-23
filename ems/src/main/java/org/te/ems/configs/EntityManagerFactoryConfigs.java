package org.te.ems.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class EntityManagerFactoryConfigs {
	
	@Bean
	public LocalEntityManagerFactoryBean getEntityMF() {
		LocalEntityManagerFactoryBean localEMF = new LocalEntityManagerFactoryBean();
		localEMF.setPersistenceUnitName("emsPersistenceUnit");
		return localEMF;
	}

}
