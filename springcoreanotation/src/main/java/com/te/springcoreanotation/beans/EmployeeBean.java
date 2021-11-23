package com.te.springcoreanotation.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBean implements Serializable {

	private Integer id;

	private String name;

	private String role;
	
	@Autowired(required = false)
	@Qualifier("test")
	private Department dept;
	

}
