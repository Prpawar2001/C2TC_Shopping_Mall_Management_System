package com.cg.smms.repository;

import com.cg.smms.entities.ShopOwner;

public interface IShopOwnerRepository {

	abstract ShopOwner addShopOwner(ShopOwner shopOwner);
	abstract ShopOwner updateShopOwner(ShopOwner shopOwner);
	abstract ShopOwner searchShopOwner(long id);
	abstract ShopOwner deleteShopOwner(long id);
}
