package com.cg.smms.repository;

import com.cg.smms.entities.OrderDetails;

public interface IOrderRepository {

	abstract OrderDetails addOrderDetails(OrderDetails orderDetails);
	abstract OrderDetails updateOrderDetails(OrderDetails orderDetails);
	abstract OrderDetails searchOrderDetails(int id);
	abstract OrderDetails deleteOrderDetails(int id);
}
