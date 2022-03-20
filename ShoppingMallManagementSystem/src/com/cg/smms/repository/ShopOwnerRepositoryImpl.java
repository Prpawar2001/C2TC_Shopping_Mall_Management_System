package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.ShopOwner;

public class ShopOwnerRepositoryImpl implements IShopOwnerRepository {

EntityManager entityManager;
	
	public ShopOwnerRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		entityManager.persist(shopOwner);
		return shopOwner;
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
		entityManager.merge(shopOwner);
		return shopOwner;
	}

	@Override
	public ShopOwner searchShopOwner(long id) {
		ShopOwner so = entityManager.find(ShopOwner.class, id);
		return so;
	}

	@Override
	public ShopOwner deleteShopOwner(long id) {
		ShopOwner so = entityManager.find(ShopOwner.class, id);
		entityManager.remove(so);
		return so;
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
}
