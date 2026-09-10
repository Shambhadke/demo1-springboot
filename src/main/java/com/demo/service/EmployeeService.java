package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.demo.Demo1Application;
import com.demo.model.Employee;
import com.demo.repository.EmployeeRepoitory;

@Service
public class EmployeeService {

	private static Logger logger=Demo1Application.logger;
	
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
	public Optional<Employee> getEmployeeById(int id)
	{
		logger.info("Fetching employee by id {}");
		return employeeRepoitory.findById(id);
	}
	public List<Employee> getEmployeeNameLike(String name)
	{
		logger.info("Fetching employee whose name like {}"+name);

		return employeeRepoitory.getEmployeeLike(name);
	}
	public int deleteEmployeeByName(String name)
	{
		logger.info("deleting employee by name {}"+name);
		return employeeRepoitory.deleteEmployeeByName(name);

	}
	public Employee updateEmployee(Employee employee)
	{
		logger.info("updating employee {}"+employee.toString());
		return employeeRepoitory.save(employee);
		
	}
}
