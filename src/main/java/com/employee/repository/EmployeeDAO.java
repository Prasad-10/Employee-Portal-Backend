package com.employee.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.employee.model.Employee;

@Transactional
public interface EmployeeDAO extends JpaRepository<Employee, String>{

}
