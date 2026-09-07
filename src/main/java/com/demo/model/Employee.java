package com.demo.model;

public class Employee {

	private int id;
	private String name;
	private String company;
	private String position;
	private double salary;
	
	
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String company, String poition, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.position = poition;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition1() {
		return position;
	}
	public void setPosition1(String poition) {
		this.position = poition;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", position=" + position + ", salary="
				+ salary + "]";
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
