package com.te.springrest.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@Entity
@Table(name = "employees_info")
@JsonInclude(Include.NON_NULL)
public class EmployeesInfo implements Serializable {
	
	@Id
	@Column(name = "emp_id")
	private Integer id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column
	private String mail;
	
	@Column
	private String pwd;
	
//	@DateTimeFormat(iso = ISO.DATE)
	@Column
	private Date dob;
	
	@Column
	private Long mobile;

}
