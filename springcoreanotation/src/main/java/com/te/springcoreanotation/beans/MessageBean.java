package com.te.springcoreanotation.beans;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageBean implements Serializable, InitializingBean, DisposableBean {

	public MessageBean() {
		System.out.println("Instantiation phase");
	}

	private String msg;

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method 4th phase");
	}

	@Override 
	  public void afterPropertiesSet() throws Exception {
	  System.out.println("Init 2nd phase");
	

}
}
