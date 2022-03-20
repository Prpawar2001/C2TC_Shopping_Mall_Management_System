package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Mall;

public class MallRepositoryImpl implements IMallRepository {

	EntityManager entityManager;
	
	public MallRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Mall addMall(Mall mall) {
		entityManager.persist(mall);
		return mall;
	}

	@Override
	public Mall updateMall(Mall mall) {
		entityManager.merge(mall);
		return mall;
	}

	@Override
	public Mall searchMall(int id) {
		Mall mall = entityManager.find(Mall.class, id);
		return mall;
	}
		
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
}
