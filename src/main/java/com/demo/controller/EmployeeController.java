package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.Demo1Application;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	List<Employee> employees=new ArrayList<>();
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id")int id)
	{
		employees.stream()
					.filter(e->e.getId()==id)
					.findFirst()
					.orElse(null);
		return null;
	}
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		/*
		Employee e=new Employee();
		e.setId(employee.getId());
		e.setCompany(employee.getCompany());
		e.setName(employee.getName());
		e.setPosition(employee.getPosition());
		e.setSalary(employee.getSalary());
		
		employees.add(e);
		Demo1Application.logger.info("Employee added successfully: {} "+employee.toString());
		return e;
		*/
		Employee saveEmployee = employeeService.saveEmployee(employee);
		return saveEmployee;
	}
	@GetMapping
	public List<Employee> getAllEmployees()
	{
		Demo1Application.logger.info("We are fetching all employees: {}");
		return employees;
	}
	@GetMapping("/hii")
	public String hii()
	{
		return "hii sham";
	}
	
}
