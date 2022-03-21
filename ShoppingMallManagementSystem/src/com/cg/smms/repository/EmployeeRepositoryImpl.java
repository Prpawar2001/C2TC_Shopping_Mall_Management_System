package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Employee;
import com.cg.smms.exception.ObjectNotFoundException;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

	EntityManager entityManager;
	
	public EmployeeRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		entityManager.persist(employee);
		System.out.println("Your Account is created, ID is:- " + employee.getId());
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		int id =employee.getId();
		Employee emp = entityManager.find(Employee.class, id);
		try
		{
			if(emp==null)
			{
				throw new ObjectNotFoundException("Please provide correct Employee ID !!\n");
			}
			else
			{
				entityManager.merge(employee);
			}
		}
		catch(ObjectNotFoundException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return employee;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee emp = entityManager.find(Employee.class, id);
		try
		{
			if(emp==null)
			{
				throw new ObjectNotFoundException("Employee Details not Found !!\n");
			}
			else
			{
				System.out.println("Employee Name:- " + emp.getName());
				System.out.println("Salary:- " + emp.getSalary());
				System.out.println("Designation:- " + emp.getDesignation());
				System.out.println("Address:- " + emp.getAddress() + "\n");
			}
		}
		catch(ObjectNotFoundException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return emp;
	}

	@Override
	public boolean deleteEmployee(int id) {
		Employee emp = entityManager.find(Employee.class, id);
		try
		{
			if(emp==null)
			{
				throw new ObjectNotFoundException("Can't delete unknown employee !!\n");
			}
			else
			{
				entityManager.remove(emp);
			}
		}
		catch(ObjectNotFoundException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return true;
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
}
