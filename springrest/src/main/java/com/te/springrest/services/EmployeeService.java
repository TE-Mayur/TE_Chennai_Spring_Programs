package com.te.springrest.services;

import java.util.List;

import com.te.springrest.beans.EmployeesInfo;

public interface EmployeeService {

	public EmployeesInfo getEmployee(Integer id);
	
	public boolean delete(Integer id); 
	
	public EmployeesInfo register(EmployeesInfo info);

	public boolean update(EmployeesInfo newData);
	
	public List<EmployeesInfo> getAll();

}
