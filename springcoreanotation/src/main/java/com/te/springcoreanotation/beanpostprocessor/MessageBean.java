package com.te.springcoreanotation.beanpostprocessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Data;

@Data
public class MessageBean {

	public MessageBean() {
		System.out.println("Instantiation phase");
		
	}
	
	private String msg;
	
	@PostConstruct
	public void init(){
//		this.msg = "InitPhase";
		System.out.println("init phase" + this.msg);
	}
	 
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy phase");
	}
}
