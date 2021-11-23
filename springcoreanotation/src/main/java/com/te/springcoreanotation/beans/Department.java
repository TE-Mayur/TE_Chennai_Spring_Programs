package com.te.springcoreanotation.beans;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable{
	
	private Integer deptId;
	
	private String deptName;

}
