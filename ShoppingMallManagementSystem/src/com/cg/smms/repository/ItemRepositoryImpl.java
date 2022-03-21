package com.cg.smms.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.User;
import com.cg.smms.exception.InvalidItemException;

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
		int a = item.getId();
		Item i = entityManager.find(Item.class, a);
		try {
			if(i==null) {
				throw new InvalidItemException("Item not Found !!");
			}
			else {
				entityManager.merge(item);
			}
		}catch(InvalidItemException e)
		{
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Item searchItem(int id) {
		Item item = entityManager.find(Item.class, id);
		try {
			if(item==null) {
				throw new InvalidItemException("Item not Found !!");
			}
			else {
				System.out.println("Item name:- "+ item.getName());
			}
		}catch(InvalidItemException e)
		{
			System.out.println(e);
		}
		return item;
	}

	@Override
	public Item deleteItem(int id) {
		Item item = entityManager.find(Item.class, id);
		try {
			if(item==null) {
				throw new InvalidItemException("Item not Found !!");
			}
			else {
				entityManager.remove(item);
			}
		}catch(InvalidItemException e)
		{
			System.out.println(e);
		}
		return item;
	}
	
	public void searchItemslist(String str) {
		Query query = entityManager.createQuery("Select i from Item i where i.name LIKE :a ");  
		query.setParameter("a", "%"+ str +"%");
		@SuppressWarnings("unchecked")  
		List<Item> list =query.getResultList();
		if(list.size()==0) {
			System.out.println("No similar item Found...");
		} else {
			System.out.println("Item :");  
		    for(Item s:list) {  
		    	System.out.println(s.getId() + " " + s.getName() + "|  Price:-" + s.getPrice());
		    } 
		}
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

}
