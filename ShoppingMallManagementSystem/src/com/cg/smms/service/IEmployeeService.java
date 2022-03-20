package com.cg.smms.service;

import com.cg.smms.entities.Employee;

public interface IEmployeeService {

	abstract Employee addEmployee(Employee employee);
	abstract Employee updateEmployee(Employee employee);
	abstract Employee searchEmployee(int id);
	abstract boolean deleteEmployee(int id);
	
}