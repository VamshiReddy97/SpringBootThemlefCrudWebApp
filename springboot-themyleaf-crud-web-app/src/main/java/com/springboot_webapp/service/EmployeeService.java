package com.springboot_webapp.service;

import java.util.List;

import com.springboot_webapp.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);

	Employee getEmployeeById(long id);

	void deleteEmployeById(long id);
}
