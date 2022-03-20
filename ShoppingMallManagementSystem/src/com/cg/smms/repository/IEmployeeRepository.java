package com.cg.smms.repository;

import com.cg.smms.entities.Employee;

public interface IEmployeeRepository {

	abstract Employee addEmployee(Employee employee);
	abstract Employee updateEmployee(Employee employee);
	abstract Employee searchEmployee(int id);
	abstract boolean deleteEmployee(int id);
}
