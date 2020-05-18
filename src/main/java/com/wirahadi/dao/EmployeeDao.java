package com.wirahadi.dao;

import java.util.List;

import com.wirahadi.model.*;

public interface EmployeeDao {
	 public List<Employee> getAllEmployees();
	 
	 public Employee findeEmployeeById(int id);
	 
	 public void addEmployee(Employee employee);
	 
	 public void updateEmployee(Employee employee);
	 
	 public void deleteEmployee(int id);
	
	
}
