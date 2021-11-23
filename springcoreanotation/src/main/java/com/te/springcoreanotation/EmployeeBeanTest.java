package com.te.springcoreanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreanotation.beans.EmployeeBean;
import com.te.springcoreanotation.config.EmployeeConfig;

public class EmployeeBeanTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

//		EmployeeBean empBean = context.getBean(EmployeeBean.class); //with default constructor
//		EmployeeBean empBean = context.getBean("getEmpWithValues",EmployeeBean.class); //with method name
		EmployeeBean empBean = context.getBean("paraCons",EmployeeBean.class);
//		bean.setId(15);
//		bean.setName("Mayur");
//		bean.setRole("CEO");
		System.out.println(empBean);
	}
}
