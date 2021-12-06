package com.te.hibernatemapping.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.te.hibernatemapping.beans.AddressInfoBean;
import com.te.hibernatemapping.beans.PrimaryInfoBean;

public class Test {
	public static void main(String[] args) {
		AddressInfoBean addressInfoBean = new AddressInfoBean();
		addressInfoBean.setAddress_id(3);
		addressInfoBean.setAddressType("P");
		addressInfoBean.setCity("Banglore");

		AddressInfoBean addressInfoBean1 = new AddressInfoBean();
		addressInfoBean1.setAddress_id(4);
		addressInfoBean1.setAddressType("T");
		addressInfoBean1.setCity("Chennai");

		List<AddressInfoBean> infoBeans = new ArrayList();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		PrimaryInfoBean bean = manager.find(PrimaryInfoBean.class, 10);

		addressInfoBean.setEmpId(bean.getEmpId());
		addressInfoBean.setInfoBean(bean);

		addressInfoBean1.setEmpId(bean.getEmpId());
		addressInfoBean1.setInfoBean(bean);

		infoBeans.add(addressInfoBean1);
		infoBeans.add(addressInfoBean);

		bean.setAddressInfoBeans(infoBeans);

		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
