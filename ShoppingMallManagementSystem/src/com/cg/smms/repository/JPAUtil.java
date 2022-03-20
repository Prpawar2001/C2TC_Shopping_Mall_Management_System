package com.cg.smms.repository;

import javax.persistence.*;

public class JPAUtil {

	public static EntityManagerFactory factory;
	public static EntityManager entityManager;
	
	static {
		factory = Persistence.createEntityManagerFactory("JPA-SMMS");
	}
	
	public static EntityManager getEntityManager() {
		
		if(entityManager == null || !entityManager.isOpen())
		{
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
}
