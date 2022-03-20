package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.MallAdmin;

public class MallAdminRepositoryImpl implements IMallAdminRepository {

	EntityManager entityManager;
	
	public MallAdminRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		entityManager.persist(mallAdmin);
		return mallAdmin;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		entityManager.merge(mallAdmin);
		return mallAdmin;
	}

	@Override
	public MallAdmin searchMallAdmin(int id) {
		MallAdmin mallAdmin = entityManager.find(MallAdmin.class, id);
		return mallAdmin;
	}

	@Override
	public MallAdmin deleteMallAdmin(int id) {
		MallAdmin mallAdmin = entityManager.find(MallAdmin.class, id);
		entityManager.remove(mallAdmin);
		return mallAdmin;
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
}
