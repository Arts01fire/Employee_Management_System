package com.yogesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogesh.domain.Employee;
import com.yogesh.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return repo.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		repo.save(employee);
		
	}

}
