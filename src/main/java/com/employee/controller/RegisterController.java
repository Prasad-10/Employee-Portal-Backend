package com.employee.controller;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class RegisterController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/register")
	public Employee createEmployee(@Valid @RequestBody Employee employee) throws ParseException
	{
		System.out.println("Entering register()");
		return service.saveEmployee(employee);
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}
}
