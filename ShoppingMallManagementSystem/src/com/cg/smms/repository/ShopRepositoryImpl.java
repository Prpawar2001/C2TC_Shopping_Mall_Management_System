package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Shop;
import com.cg.smms.exception.ShopNotFoundException;

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
		int a =shop.getId();
		Shop sh = entityManager.find(Shop.class , a);
		try {
			if(sh==null) {
				throw new ShopNotFoundException("Shop not found");
			}
			else {
				entityManager.merge(shop);
			}
		}
		catch(ShopNotFoundException e)
		{
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Shop SearchShopById(int id) {
		Shop shop = entityManager.find(Shop.class , id);
		try {
			if(shop==null) {
				throw new ShopNotFoundException("Shop not found");
			}
			else {
				System.out.println("Shop Name :- " + shop.getShopName());
			}
		}catch(ShopNotFoundException e)
		{
			System.out.println(e);
		}
		return shop;
	}

	@Override
	public boolean deleteShop(int id) {
		Shop shop = entityManager.find(Shop.class , id);
		try {
			if(shop==null) {
				throw new ShopNotFoundException("Shop not found");
			}
			else {
				entityManager.remove(shop);
			}
		}catch(ShopNotFoundException e)
		{
			System.out.println(e);
		}
		return true;
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
}
