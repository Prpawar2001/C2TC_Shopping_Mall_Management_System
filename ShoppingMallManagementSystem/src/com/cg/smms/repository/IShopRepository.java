package com.cg.smms.repository;

import com.cg.smms.entities.Shop;

public interface IShopRepository {

	public abstract Shop addShop(Shop shop);
	public abstract Shop updateShop(Shop shop);
	public abstract Shop SearchShopById(int id);
	public abstract boolean deleteShop(int id);
	
}
