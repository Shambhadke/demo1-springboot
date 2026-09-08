package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.demo.Demo1Application;
import com.demo.model.Employee;
import com.demo.repository.EmployeeRepoitory;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepoitory employeeRepoitory;
	
	public Employee saveEmployee(Employee employee)
	{
		Employee save = employeeRepoitory.save(employee);
		Demo1Application.logger.info("WE are in {} Employee service");
		return save;
		
	}
	public List<Employee> getAllEmployee()
	{
		Demo1Application.logger.info("We are fetching all employee {}");
		return employeeRepoitory.findAll();
	}
}
