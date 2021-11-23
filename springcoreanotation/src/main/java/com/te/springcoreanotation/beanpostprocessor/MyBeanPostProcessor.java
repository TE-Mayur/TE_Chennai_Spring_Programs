package com.te.springcoreanotation.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof MessageBean) {
			MessageBean messageBean = (MessageBean) bean;
			System.out.println(messageBean.getMsg() + " BI ");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof MessageBean){
			MessageBean messageBean = (MessageBean) bean;
			System.out.println("After init " + messageBean.getMsg());
		}
		return bean;
	}

}
