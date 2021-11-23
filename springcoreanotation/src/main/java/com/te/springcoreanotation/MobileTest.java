package com.te.springcoreanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcoreanotation.beans.MobileBean;

public class MobileTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mobileconfig.xml");
		
		MobileBean bean = context.getBean(MobileBean.class);
		
		System.out.println(bean.getMobileCompany().getBrand());
		System.out.println(bean.getMobileCompany().getModel());
		System.out.println(bean.getMobileCompany().getOs());
		System.out.println(bean.getMobileCompany().getPrize());
		System.out.println(bean.getMobileCompany().getRam());
	}

}
