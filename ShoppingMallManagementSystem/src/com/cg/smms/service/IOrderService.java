package com.cg.smms.service;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;

public interface IOrderService {

	abstract OrderDetails addOrder(OrderDetails order);
	abstract OrderDetails updateOrder(OrderDetails order);
	abstract OrderDetails searchOrder(int id);
	abstract boolean cancelOrder(int id);
	abstract Item addItem(Item item);
	
}
