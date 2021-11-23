package com.te.springjax.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="user-address")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserAddressBean implements Serializable{
	
	@XmlAttribute
	private String addresstype;
	
	@XmlElement(name="house-number")
	private Integer houseno;
	
	@XmlElement
	private String street;
	
	@XmlElement
	private String city;

}
