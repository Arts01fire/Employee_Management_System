package com.yogesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yogesh.domain.Employee;
import com.yogesh.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployee", service.getAllEmployee());
		return "index";
	}
	
	@GetMapping("/showEmployeeForm")
	public String showEmployeeForm(Model model) {
		
		model.addAttribute("employee", new Employee());
		return "new_employee";
		
	}

}
