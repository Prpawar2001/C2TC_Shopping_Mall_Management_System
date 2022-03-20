package com.cg.smms.service;

import com.cg.smms.entities.Shop;
import com.cg.smms.entities.User;

public interface IAdminService {

	abstract boolean approveNewShop(Shop shop);
	abstract User updateUser(User user);
	
	abstract User login(User user);
	abstract boolean logout();
	
}
