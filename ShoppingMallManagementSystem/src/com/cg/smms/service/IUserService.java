package com.cg.smms.service;

import com.cg.smms.entities.User;

public interface IUserService {

	abstract User addUser(User user);
	abstract User updateUser(User user);
	abstract User login(User user);
	abstract boolean logout();
	
}
