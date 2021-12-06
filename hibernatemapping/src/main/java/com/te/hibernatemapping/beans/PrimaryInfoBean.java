package com.te.hibernatemapping.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "employee_primary_info")
public class PrimaryInfoBean implements Serializable {

	@Id
	@Column
	private Integer empId;

	@Column
	private String name;

	@Column
	private Double salary;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "primaryInfoBean")
	private SecondaryInfoBean secondary; // bidirectional

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private List<AddressInfoBean> addressInfoBeans;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "employees")
	private List<ProjectInfo> projects;
}
