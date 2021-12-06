package com.te.hibernatemapping.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "project_info")
public class ProjectInfo implements Serializable {

	@Id
	@Column
	private Integer pid;

	@Column
	private String projectName;

	@Exclude
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_projects_info", 
						joinColumns = @JoinColumn(name = "pid"), 
						inverseJoinColumns = @JoinColumn(name = "empId"))
	private List<PrimaryInfoBean> employees;

}
