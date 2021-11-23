package com.te.springjax.xmltest;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.te.springjax.beans.EmployeesBean;

public class XMLUnMarshallingTest2 {
	public static void main(String[] args) {

		JAXBContext context;

		try {
			context = JAXBContext.newInstance(EmployeesBean.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();

			EmployeesBean bean = (EmployeesBean) unmarshaller.unmarshal(new File("userinfo.xml"));
			System.out.println(bean.getAddressBeans().get(0).getCity());
			System.out.println(bean.getAddressBeans().get(1).getCity());
			System.out.println(bean.getOtherInfo().getGender());
			System.out.println(bean.getOtherInfo().getAadhar());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
