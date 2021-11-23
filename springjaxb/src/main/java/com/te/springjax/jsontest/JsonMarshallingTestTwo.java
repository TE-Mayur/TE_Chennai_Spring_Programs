package com.te.springjax.jsontest;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import org.codehaus.jackson.map.ObjectMapper;

import com.te.springjax.beans.EmployeesBean;
import com.te.springjax.beans.UserAddressBean;
import com.te.springjax.beans.UserOtherInfoBean;

public class JsonMarshallingTestTwo {

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

		UserOtherInfoBean otherInfoBean = new UserOtherInfoBean();
		otherInfoBean.setAadhar(8735790347L);
		otherInfoBean.setGender("Male");

		bean.setOtherInfo(otherInfoBean);

		UserAddressBean addressBean = new UserAddressBean();
		addressBean.setAddresstype("Temporary");
		addressBean.setCity("Delhi");
		addressBean.setHouseno(700);
		addressBean.setStreet("T Nagar");

		UserAddressBean addressBean1 = new UserAddressBean();
		addressBean1.setAddresstype("Permanent");
		addressBean1.setCity("Chennai");
		addressBean1.setHouseno(700);
		addressBean1.setStreet("Anna Nagar");

		ArrayList<UserAddressBean> addressBeans = new ArrayList();

		addressBeans.add(addressBean1);
		addressBeans.add(addressBean);

		bean.setAddressBeans(addressBeans);

		ObjectMapper mapper = new ObjectMapper();

		try {
			mapper.writeValue(System.out, bean);
			mapper.writeValue(new File("userData.json"), bean);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
