package org.te.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.te.ems.beans.EmployeesInfo;
import org.te.ems.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeesInfo authenticate(Integer id, String password) {
		if (id <= 0) {
			return null;
		}
		return dao.authenticate(id, password);
	}

	@Override
	public EmployeesInfo getEmployee(Integer id) {
		if (id <= 0) {
			return null;
		}
		return dao.getEmployee(id);
	}

	@Override
	public boolean delete(Integer id) {
		if (id <= 0) {
			return false;
		}
		return dao.delete(id);
	}

	@Override
	public boolean register(EmployeesInfo info) {
		return dao.register(info);
	}

	@Override
	public boolean update(EmployeesInfo newData) {
		return dao.update(newData);
	}

	@Override
	public List<EmployeesInfo> getAll() {
		return dao.getAll();
	}

}
