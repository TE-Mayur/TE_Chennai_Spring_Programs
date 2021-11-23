package com.te.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springrest.beans.EmployeesInfo;
import com.te.springrest.dao.EmployeeDAO;
import com.te.springrest.exceptions.EmployeesException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeesInfo getEmployee(Integer id) {
		if (id <= 0) {
			throw new EmployeesException("Data not found");
		}
		EmployeesInfo employeesInfo = dao.getEmployee(id);
		if (employeesInfo != null) {
			employeesInfo.setPwd(null);
			return employeesInfo;
		} else {
			throw new EmployeesException("Data Not Found");
		}
	}

	@Override
	public boolean delete(Integer id) {
		if (id <= 0) {
			return false;
		}
		return dao.delete(id);
	}

	@Override
	public EmployeesInfo register(EmployeesInfo info) {
		if (dao.register(info)) {
			EmployeesInfo info2 = dao.getEmployee(info.getId());
			info2.setPwd(null);
			return info2;
		}
		throw new EmployeesException("Data Already Exists");
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
