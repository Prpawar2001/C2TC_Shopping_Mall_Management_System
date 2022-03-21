package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Item;
import com.cg.smms.entities.Shop;
import com.cg.smms.entities.User;
import com.cg.smms.repository.EmployeeRepositoryImpl;
import com.cg.smms.repository.ItemRepositoryImpl;
import com.cg.smms.repository.ShopRepositoryImpl;
import com.cg.smms.repository.UserRepositoryImpl;

public class ShopServiceImpl implements IShopService {

	private ShopRepositoryImpl sri;
	private UserRepositoryImpl uri;
	private ItemRepositoryImpl iri;
	
	public ShopServiceImpl() {
		sri = new ShopRepositoryImpl();
		uri = new UserRepositoryImpl();
		iri = new ItemRepositoryImpl();
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
	
	public User login(User user) {
		String a = user.getPassword();
		uri.beginTransaction();
		User u = uri.searchUser(user);          // getting info of user from User Database
		String b = u.getPassword();
		boolean ans = a.equals(b);
		if(ans==true) {
			System.out.println("** Dear "+ u.getName() +", Login Successful !!! **");
			System.out.println("You are " + u.getType());
		}else {
			System.out.println("** Invalid input!! **");
		}
		uri.commitTransaction();
		return null;
	}

	public boolean logout() {
		System.out.println("** Logout... Visit Again **");
		return false;
	}
	@Override
	public Item addItem(Item item) {
		iri.beginTransaction();
		iri.addItem(item);
		iri.commitTransaction();
		return null;
	}

}
