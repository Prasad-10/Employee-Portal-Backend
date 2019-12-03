package com.employee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO dao;
	
	@Override
	public Employee saveEmployee(Employee employee) throws ParseException {
		//String date = employee.getDob();
		//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		//String dateStr = format.format(date);  
		//employee.setDob(dateStr);
		return dao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) dao.findAll();
	}

}
