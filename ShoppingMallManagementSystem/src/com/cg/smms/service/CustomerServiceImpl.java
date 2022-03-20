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
		float price = item.getPrice();
		OrderDetails od = new OrderDetails();
		LocalDate date = LocalDate.now();
		od.setId(1);
		od.setDateOfPurchase(date);
		od.setTotal(price);
		od.setPaymentMode("Cash On Delivery");
		ori.addOrderDetails(od);
		return null;
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
		uri.beginTransaction();
		User u = uri.searchUser(user);          // getting info using JPQL Query from User Repository --> searchUser()
		if(u==null) {
			System.out.println("** No User Data Found!! **");
		}else {
			System.out.println("** Dear user, Login Successful !!! **");
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
