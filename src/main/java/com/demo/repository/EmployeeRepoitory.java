package com.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;
@Repository
public interface EmployeeRepoitory extends JpaRepository<Employee,Integer>{

	@Query("SELECT e FROM Employee e WHERE e.name LIKE %:name%")
	public List<Employee> getEmployeeLike(@Param("name") String name);
	
	@Query("DELETE FROM Employee WHERE name LIKE %:name%")
	public List<Employee> deleteEmployeeByName(@Param("name") String name);
}
