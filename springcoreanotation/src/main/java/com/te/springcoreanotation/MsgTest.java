package com.te.springcoreanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.springcoreanotation.beanpostprocessor.MessageBean;
import com.te.springcoreanotation.config.MessageConfig;

public class MsgTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		
		MessageBean bean  = context.getBean("messageBean", MessageBean.class);
		bean.setMsg("Spring Core ");
		System.out.println(bean.getMsg() + "util phase");
		
		((AbstractApplicationContext)context).close();
	}

}
