package com.cg.smms.repository;

import com.cg.smms.entities.User;

public interface IUserRepository {

	abstract User addNewUser(User user);
	abstract User updateNewUser(User user);
	abstract User deleteNewUser(int id);
	
}
