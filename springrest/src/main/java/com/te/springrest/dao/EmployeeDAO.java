package com.te.springrest.dao;

import java.util.List;

import com.te.springrest.beans.EmployeesInfo;

public interface EmployeeDAO {

	public EmployeesInfo getEmployee(Integer id);

	public boolean delete(Integer id);

	public boolean register(EmployeesInfo info);

	public boolean update(EmployeesInfo newData);

	public List<EmployeesInfo> getAll();

}
