package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Shop;
import com.cg.smms.repository.EmployeeRepositoryImpl;
import com.cg.smms.repository.ShopRepositoryImpl;

public class ShopServiceImpl implements IShopService {

	private ShopRepositoryImpl sri;
	
	public ShopServiceImpl() {
		sri = new ShopRepositoryImpl();
	}
	@Override
	public Shop addShop(Shop shop) {
		sri.beginTransaction();
		sri.addShop(shop);
		sri.commitTransaction();
		return null;
	}

	@Override
	public Shop updateShop(Shop shop) {
		sri.beginTransaction();
		sri.updateShop(shop);
		sri.commitTransaction();
		return null;
	}

	@Override
	public Shop searchShopById(int id) {
		Shop shop = sri.SearchShopById(id);
		return shop;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		sri.beginTransaction();
		EmployeeRepositoryImpl eri =new EmployeeRepositoryImpl();
		eri.addEmployee(employee);
		sri.commitTransaction();
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		sri.beginTransaction();
		EmployeeRepositoryImpl eri =new EmployeeRepositoryImpl();
		eri.updateEmployee(employee);
		sri.commitTransaction();
		return false;
	}

	@Override
	public boolean deleteShop(int id) {
		sri.beginTransaction();
		sri.deleteShop(id);
		sri.commitTransaction();
		return false;
	}

}
