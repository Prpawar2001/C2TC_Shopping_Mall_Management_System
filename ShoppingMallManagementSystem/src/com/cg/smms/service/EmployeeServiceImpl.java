package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements IEmployeeService {

	private EmployeeRepositoryImpl emri;
	
	public EmployeeServiceImpl() {
		emri = new EmployeeRepositoryImpl();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		emri.beginTransaction();
		emri.addEmployee(employee);	
		emri.commitTransaction();
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		emri.beginTransaction();
		emri.updateEmployee(employee);
		emri.commitTransaction();
		return null;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee emp = emri.searchEmployee(id);
		return emp;
	}

	@Override
	public boolean deleteEmployee(int id) {
		emri.beginTransaction();
		emri.deleteEmployee(id);
		emri.commitTransaction();
		return false;
	}
	
}
