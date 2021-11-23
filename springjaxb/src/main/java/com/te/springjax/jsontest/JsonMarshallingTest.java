package com.te.springjax.jsontest;

import java.io.File;
import java.util.Date;

import org.codehaus.jackson.map.ObjectMapper;

import com.te.springjax.beans.EmployeesBean;

public class JsonMarshallingTest {

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
	
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			mapper.writeValue(System.out, bean);
			mapper.writeValue(new File("user.json"), bean);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
