package com.cg.smms.repository;

import com.cg.smms.entities.Item;

public interface IItemRepository {

	abstract Item addItem(Item item);
	abstract Item updateItem(Item item);
	abstract Item searchItem(int id);
	abstract Item deleteItem(int id);
	
}
