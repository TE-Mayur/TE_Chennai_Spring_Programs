package com.te.springcore.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageBean implements Serializable  {

	public MessageBean() {
		System.out.println("Ist Phase");
	}
	
	private String msg;
	
	public void myInit() {
		System.out.println("Init 2nd phase");
	}
	
	public void myDestroy() {
		System.out.println("Destroy method 4th phase");
	}
	
	/*
	 * @Override public void destroy() throws Exception { System.out.println(
	 * "Destroy method 4th phase"); }
	 * 
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("Init 2nd phase");
	 * 
	 * }
	 */

}
