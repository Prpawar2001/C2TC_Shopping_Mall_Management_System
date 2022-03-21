package com.cg.smms.service;

import com.cg.smms.entities.*;


public interface IShopService {
	
	abstract Shop addShop(Shop shop);
	abstract Shop updateShop(Shop shop);
	abstract Shop searchShopById(int id);
	abstract boolean addEmployee(Employee employee);
	abstract boolean updateEmployee(Employee employee);
	abstract boolean deleteShop(int id);
	abstract Item addItem(Item item);

}