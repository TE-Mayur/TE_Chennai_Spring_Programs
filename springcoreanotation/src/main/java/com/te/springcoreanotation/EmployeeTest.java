package com.te.springcoreanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreanotation.beans.EmployeeBean;
import com.te.springcoreanotation.config.AllImport;
import com.te.springcoreanotation.config.Employee2Config;

public class EmployeeTest {

	public static void main(String[] args) {
		
	
	ApplicationContext context = new AnnotationConfigApplicationContext(AllImport.class);
	
	EmployeeBean bean = context.getBean(EmployeeBean.class);
	
	System.out.println(bean.getName());
//	System.out.println();
	System.out.println(bean.getRole());
	if (bean.getDept() != null) {
		
		System.out.println(bean.getDept().getDeptName());
		System.out.println(bean.getDept().getDeptId());
		
		
	}
}
}