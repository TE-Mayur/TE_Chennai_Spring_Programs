package com.te.springjax.jsontest;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import com.te.springjax.beans.EmployeesBean;

public class JsonUnmarshallingTest {
	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
		 EmployeesBean bean = 	mapper.readValue(new File("user.json"), EmployeesBean.class);
			System.out.println(bean.getDatebirth());
			System.out.println(bean.getDesgination());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
