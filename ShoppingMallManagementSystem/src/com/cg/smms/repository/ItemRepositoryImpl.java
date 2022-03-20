package com.cg.smms.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.User;

public class ItemRepositoryImpl implements IItemRepository {

	EntityManager entityManager; 
	
	public ItemRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public Item addItem(Item item) {
		entityManager.persist(item);
		return item;
	}

	@Override
	public Item updateItem(Item item) {
		entityManager.merge(item);
		return item;
	}

	@Override
	public Item searchItem(int id) {
		Item item = entityManager.find(Item.class, id);
		return item;
	}

	@Override
	public Item deleteItem(int id) {
		Item item = entityManager.find(Item.class, id);
		entityManager.remove(item);
		return item;
	}
	
	public void searchItemslist(String str) {
		Query query = entityManager.createQuery("Select i from Item i where i.name like % :str %");  
		@SuppressWarnings("unchecked")  
		List<Item> list =query.getResultList();
	    System.out.println("Item :");  
	    for(Item s:list) {  
	    	System.out.println(s);
	     } 
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

}
