package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;


@Service
public class EmployeeServiceimpl implements EmployeeService {
	
	
	
	public EmployeeServiceimpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

}
