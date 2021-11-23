package com.te.springcoreanotation.config;

import org.springframework.context.annotation.Bean;

import com.te.springcoreanotation.beanfactory.MyBeanFactoryPP;
import com.te.springcoreanotation.beanpostprocessor.MessageBean;
import com.te.springcoreanotation.beanpostprocessor.MyBeanPostProcessor;

public class MessageConfig {

	@Bean("messageBean")
	public MessageBean getMsg() {
		MessageBean bean = new MessageBean();
		bean.setMsg("Hello World");
		return bean;
	}


	@Bean
	public MyBeanPostProcessor getMBPP() {
		return new MyBeanPostProcessor();
	}
	
	@Bean
	public MyBeanFactoryPP getMBFPP() {
		return new MyBeanFactoryPP();
	}
}
