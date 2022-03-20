package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Shop;

public class ShopRepositoryImpl implements IShopRepository {

	EntityManager entityManager;
	
	public ShopRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Shop addShop(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		entityManager.merge(shop);
		return shop;
	}

	@Override
	public Shop SearchShopById(int id) {
		Shop shop = entityManager.find(Shop.class , id);
		return shop;
	}

	@Override
	public boolean deleteShop(int id) {
		Shop shop = entityManager.find(Shop.class , id);
		entityManager.remove(shop);
		return true;
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
}
