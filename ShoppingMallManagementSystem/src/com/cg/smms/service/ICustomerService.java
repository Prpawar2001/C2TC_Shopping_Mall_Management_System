package com.cg.smms.service;

import java.util.List;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.Mall;
import com.cg.smms.entities.User;

public interface ICustomerService {

	abstract List<Item> searchItem(String itemName);
	abstract Item orderItem(Item item);
	abstract Mall searchMall(int id);
	abstract boolean cancelOrder(int id);
	
	abstract User login(User user);
	abstract boolean logout();
		
}