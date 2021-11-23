package com.te.springjax.xmltest;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.te.springjax.beans.EmployeesBean;

public class XMLUnmarshallingTest {

	public static void main(String[] args) {
		
		JAXBContext context;
		
		try {
			context = JAXBContext.newInstance(EmployeesBean.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
		EmployeesBean bean =(EmployeesBean)	unmarshaller.unmarshal(new File("employeeinfo.xml"));
		System.out.println(bean.getDesgination());
		System.out.println(bean.getPassword());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
