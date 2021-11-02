package com.te.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.beans.Employee;

public class App {
    
	public static void main( String[] args){
		
		Scanner scan = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Employee empOne = context.getBean("emp", Employee.class);
    
		System.out.println(" Enter the name of employee one ");
		empOne.setName(scan.nextLine());
		System.out.println(" Enter the id of employee one ");
		empOne.setId(Integer.parseInt(scan.nextLine()));
		System.out.println(" Enter the role of employee one ");
		empOne.setRole(scan.nextLine());
		
		System.out.println(empOne);
		
		Employee empTwo = context.getBean("emp", Employee.class);
	    
		System.out.println(" Enter the name of employee twos ");
		empTwo.setName(scan.nextLine());
		System.out.println(" Enter the id of employee two ");
		empTwo.setId(Integer.parseInt(scan.nextLine()));
		System.out.println(" Enter the role of employee two ");
		empTwo.setRole(scan.nextLine());
		
		System.out.println(empTwo);
		System.out.println("--------------------------------");
		
		System.out.println(empOne.hashCode());
		System.out.println(empTwo.hashCode());
		
		
	
	}
}
