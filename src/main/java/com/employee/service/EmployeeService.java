package com.employee.service;

import java.text.ParseException;
import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
}
