package org.te.ems.services;

import java.util.List;

import org.te.ems.beans.EmployeesInfo;

public interface EmployeeService {

	public EmployeesInfo authenticate(Integer id, String password);

	public EmployeesInfo getEmployee(Integer id);
	
	public boolean delete(Integer id); 
	
	public boolean register(EmployeesInfo info);

	public boolean update(EmployeesInfo newData);
	
	public List<EmployeesInfo> getAll();

}
