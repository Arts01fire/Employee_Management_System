package com.yogesh.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogesh.domain.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Serializable> {

}
