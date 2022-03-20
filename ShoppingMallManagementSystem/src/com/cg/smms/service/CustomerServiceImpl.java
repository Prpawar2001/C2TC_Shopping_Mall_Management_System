package com.cg.smms.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.Mall;
import com.cg.smms.entities.OrderDetails;
import com.cg.smms.entities.User;
import com.cg.smms.repository.ItemRepositoryImpl;
import com.cg.smms.repository.MallRepositoryImpl;
import com.cg.smms.repository.OrderRepositoryImpl;
import com.cg.smms.repository.UserRepositoryImpl;

public class CustomerServiceImpl implements ICustomerService {
 
	ItemRepositoryImpl iri;
	OrderRepositoryImpl ori;
	MallRepositoryImpl mri;
	UserRepositoryImpl uri;
	
	public CustomerServiceImpl() {
		iri = new ItemRepositoryImpl();
		uri = new UserRepositoryImpl();
		ori = new OrderRepositoryImpl();
		mri = new MallRepositoryImpl();
	}
	
	@Override
	public List<Item> searchItem(String itemName) {
		iri.beginTransaction();
		iri.searchItemslist(itemName);
		iri.commitTransaction();
		return null;
	}

	@Override
	public Item orderItem(Item item) {
		int a = item.getId();
		iri.beginTransaction();
		Item i = iri.searchItem(a);
		return i;
	}

	@Override
	public Mall searchMall(int id) {
		mri.beginTransaction();
		mri.searchMall(id);
		mri.commitTransaction();
		return null;
	}

	@Override
	public boolean cancelOrder(int id) {
		
		return false;
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
		return u;
	}

	@Override
	public boolean logout() {
		System.out.println("** Logout... Visit Again **");
		return false;
	}

}
