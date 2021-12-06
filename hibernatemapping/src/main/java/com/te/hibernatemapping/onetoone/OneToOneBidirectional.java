package com.te.hibernatemapping.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.te.hibernatemapping.beans.PrimaryInfoBean;
import com.te.hibernatemapping.beans.SecondaryInfoBean;

public class OneToOneBidirectional {

	public static void main(String[] args) {
		PrimaryInfoBean bean = new PrimaryInfoBean();
		bean.setEmpId(20);
		bean.setName("Praveen");
		bean.setSalary(490000.0);

		SecondaryInfoBean secondaryInfoBean = new SecondaryInfoBean();
		secondaryInfoBean.setEmpId(20);
		secondaryInfoBean.setAge(50);
		secondaryInfoBean.setGender("Prefer Not to Say");
		secondaryInfoBean.setPrimaryInfoBean(bean);
		
		bean.setSecondary(secondaryInfoBean);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager manager = factory.createEntityManager();
//		manager.getTransaction().begin();
//		manager.persist(bean);
//		manager.getTransaction().commit();

		PrimaryInfoBean infoBean = manager.find(PrimaryInfoBean.class, 20);
		System.out.println(infoBean);
		System.out.println("Inserted");
		manager.close();
		factory.close();
	}
}
