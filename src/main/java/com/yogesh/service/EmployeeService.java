package com.yogesh.service;

import java.util.List;

import com.yogesh.domain.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	void saveEmployee(Employee employee);

}
