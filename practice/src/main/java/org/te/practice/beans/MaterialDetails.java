package org.te.practice.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialDetails implements Serializable{
	
	private Integer quantity;
	
	private String product;
	
	private Double price;
	
	private String brand;
	
	private String materialType;
	
	private Double gstPrice;
	
	private String quality;
		

}
