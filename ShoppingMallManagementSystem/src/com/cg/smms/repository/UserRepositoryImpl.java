package com.cg.smms.repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.smms.entities.User;

public class UserRepositoryImpl implements IUserRepository{

EntityManager entityManager;
	
	public UserRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public User addNewUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateNewUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteNewUser(int id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
		return user;
	}
	
	public User searchUser(User user) {
		int a= user.getId();
		Query query = entityManager.createQuery("Select u from User u where u=1");
		return (User)query.getSingleResult();
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

}
