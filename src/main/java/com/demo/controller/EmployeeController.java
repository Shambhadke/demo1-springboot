package com.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Optional<Employee> getEmployeeById(@PathVariable("id")int id)
	{
		return employeeService.getEmployeeById(id);
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
		
		return employeeService.getAllEmployee();
	}
	@GetMapping("/hii")
	public String hii()
	{
		return "hii sham";
	}
	@GetMapping("/search")
	public List<Employee> getEmployeeNameLike(@RequestParam("name") String name)
	{
		return employeeService.getEmployeeNameLike(name);
	}
	@GetMapping("/delete")
	public List<Employee> deleteEMployeeByName(@RequestParam("name") String name)
	{
		return employeeService.deleteEmployeeByName(name);
	}

	
}
