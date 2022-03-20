package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Customer;

public class CustomerRepositoryImpl implements ICustomerRepository {
	
	EntityManager entityManager;
	
	public CustomerRepositoryImpl() {
		 entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		entityManager.persist(customer);
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		entityManager.merge(customer);
		return null;
	}

	@Override
	public Customer searchCustomer(int id) {
		Customer customer = entityManager.find(Customer.class, id);
		return customer;
	}

	@Override
	public boolean deleteCustomer(int id) {
		Customer customer = entityManager.find(Customer.class, id);
		entityManager.remove(customer);
		return false;
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
}
