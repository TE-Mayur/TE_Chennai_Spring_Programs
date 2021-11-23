package com.te.springcoreanotation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreanotation.beans.EmployeeBean;
import com.te.springcoreanotation.config.EmployeeConfig;

public class EmployeeBeanTest2 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean empBean = context.getBean("defltcons",EmployeeBean.class);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the id of emp 1");
		empBean.setId(Integer.parseInt(scanner.nextLine()));
		System.out.println("enter the Name of emp 1");
		empBean.setName(scanner.nextLine());
		System.out.println("enter the Role of emp 1");
		empBean.setRole(scanner.nextLine());
		
		System.out.println("Emp one " + empBean);
		
		EmployeeBean empBean2 = context.getBean("defltcons", EmployeeBean.class);
		
		System.out.println("Enter the id of emp 2");
		empBean2.setId(Integer.parseInt(scanner.nextLine()));
		System.out.println("enter the Name of emp 2");
		empBean2.setName(scanner.nextLine());
		System.out.println("enter the Role of emp 2");
		empBean2.setRole(scanner.nextLine());
		
		System.out.println("Emp two " + empBean2);
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Emp one " + empBean);
		System.out.println("Emp two " + empBean2);

	}
}
