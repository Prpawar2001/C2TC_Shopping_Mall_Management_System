package com.cg.smms.service;

import com.cg.smms.entities.Shop;
import com.cg.smms.entities.User;
import com.cg.smms.repository.*;

public class AdminServiceImpl implements IAdminService {

	ShopRepositoryImpl sri;
	UserRepositoryImpl uri;
	
	public AdminServiceImpl() {
		sri = new ShopRepositoryImpl();
		uri = new UserRepositoryImpl();
	}

	@Override
	public boolean approveNewShop(Shop shop) {
	 	sri.beginTransaction();
	 	sri.addShop(shop);
	 	sri.commitTransaction();	
		return true;
	}

	@Override
	public User updateUser(User user) {
		uri.beginTransaction();
		uri.updateNewUser(user);
		uri.commitTransaction();
		return null;
	}

	@Override
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

	@Override
	public boolean logout() {
		System.out.println("** Logout... Visit Again **");
		return false;
	}
}
