package com.te.springjax.xmltest;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.te.springjax.beans.EmployeesBean;

public class XMLMarshallingTest {

	public static void main(String[] args) {
		
		EmployeesBean bean = new EmployeesBean();
		
		bean.setDatebirth(new Date());
		bean.setDatejoin(new Date());
		bean.setDesgination("Develop");
		bean.setEmailId("mayur@gmail.com");
		bean.setEmpid(1458);
		bean.setEmpname("Mayur");
		bean.setIsmarried(false);
		bean.setLocation("Chennai");
		bean.setMobileno(95453483453L);
		bean.setPassword("mayur123");
		bean.setSalary(40000.0);
		
	
		JAXBContext context;
		
		try {
			context = JAXBContext.newInstance(EmployeesBean.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(bean, System.out);
			marshaller.marshal(bean, new File("employeeinfo.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
