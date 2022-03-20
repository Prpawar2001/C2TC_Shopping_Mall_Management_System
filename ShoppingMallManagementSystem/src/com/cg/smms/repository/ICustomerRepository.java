package com.cg.smms.repository;

import com.cg.smms.entities.Customer;

public interface ICustomerRepository {

	abstract Customer addCustomer(Customer customer);
	abstract Customer updateCustomer(Customer customer);
	abstract Customer searchCustomer(int id);
	abstract boolean deleteCustomer(int id);
}
