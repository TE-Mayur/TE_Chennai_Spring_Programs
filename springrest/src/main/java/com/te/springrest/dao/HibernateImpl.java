package com.te.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springrest.beans.EmployeesInfo;
import com.te.springrest.exceptions.EmployeesException;
import com.te.springrest.exceptions.EntityNotFoundExp;

@Repository
public class HibernateImpl implements EmployeeDAO {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public EmployeesInfo getEmployee(Integer id) {
		EntityManager manager = factory.createEntityManager();
		EmployeesInfo info = manager.find(EmployeesInfo.class, id);
		return info;
	}

	@Override
	public boolean delete(Integer id) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			EmployeesInfo info = manager.find(EmployeesInfo.class, id);
			manager.remove(info);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new EmployeesException("Data is missing for " + id);

		}
	}

	@Override
	public boolean register(EmployeesInfo info) {
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;

		}
	}

	@Override
	public boolean update(EmployeesInfo newData) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isUpdated = false;
		try {
			transaction.begin();
			EmployeesInfo oldData = manager.find(EmployeesInfo.class, newData.getId());

			if (newData.getName() != null) {
				oldData.setName(newData.getName());
			}

			if (newData.getMobile() != null) {
				oldData.setMobile(newData.getMobile());
			}

			if (newData.getMail() != null) {
				oldData.setMail(newData.getMail());
			}
			
			if (newData.getPwd() != null) {
				oldData.setPwd(newData.getPwd());
			}

			if (newData.getDob() != null) {
				oldData.setDob(newData.getDob());
			}
			transaction.commit();
			isUpdated = true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			throw new EmployeesException("Something went wrong");
		}
		return isUpdated;
	}

	@Override
	public List<EmployeesInfo> getAll() {
		EntityManager manager = factory.createEntityManager();
		String query ="from EmployeesInfo";
		Query quer = manager.createQuery(query);
		List<EmployeesInfo> listofemp = quer.getResultList();
		return listofemp;
	}
}