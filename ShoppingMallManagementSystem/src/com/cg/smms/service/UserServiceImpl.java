package com.cg.smms.service;

import com.cg.smms.entities.User;
import com.cg.smms.repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService {

	private UserRepositoryImpl uri;
	
	public UserServiceImpl() {
		uri = new UserRepositoryImpl();
	}

	@Override
	public User addUser(User user) {
		uri.beginTransaction();
		uri.addNewUser(user);
		uri.commitTransaction();
		return null;
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
