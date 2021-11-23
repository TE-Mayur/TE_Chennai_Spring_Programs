package com.te.springjax.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import lombok.Data;

@Data
@XmlRootElement(name="Employee-info")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("user_info")
@JsonPropertyOrder({"empId","emp_name"})
@JsonSerialize(include = Inclusion.NON_NULL)
public class EmployeesBean implements Serializable {
	
	@JsonProperty
	@XmlElement(name="emp-id")
	private Integer empid;

	@JsonProperty("emp_name")
	@XmlElement(name="emp-name")
	private String empname;

	@XmlElement(name="Email-id")
	private String emailId;

	@JsonIgnore
	@XmlTransient
	private String password;

	@XmlElement(name="emp-dateofbirth")
	private Date datebirth;

	private Long mobileno;

	@XmlElement(name="emp-JoiningData")
	private Date datejoin;

	@XmlElement
	private Double salary;

	@XmlElement
	private String location;

	@XmlElement
	private String desgination;

	@XmlElement(name = "Maritial-status")	
	private Boolean ismarried;

	@JsonProperty
	@XmlElement
	private UserOtherInfoBean otherInfo;
	
	@JsonProperty
	@XmlElementWrapper(name= "user-address")
	private List<UserAddressBean> addressBeans;
}
