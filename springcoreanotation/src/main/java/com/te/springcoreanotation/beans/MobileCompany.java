package com.te.springcoreanotation.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MobileCompany implements Serializable {
	
	private String os;
	
	private String model;
	
	private Integer ram;
	
	private String brand;
	
	private double prize;

}
