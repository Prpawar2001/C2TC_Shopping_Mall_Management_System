package com.cg.smms.service;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;
import com.cg.smms.repository.*;

public class OrderServiceImpl implements IOrderService {

	private OrderRepositoryImpl ori;
	private MallRepositoryImpl mri;
	private ItemRepositoryImpl iri;

//	Constructor
	public OrderServiceImpl() {
		// TODO Auto-generated constructor stub
		ori = new OrderRepositoryImpl();
		mri = new MallRepositoryImpl();
		iri = new ItemRepositoryImpl();
	}

//	addOrder
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		ori.beginTransaction();
		ori.addOrderDetails(order);
		ori.commitTransaction();
		return order;
	}

//	updateOrder
	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		ori.beginTransaction();
		ori.updateOrderDetails(order);
		ori.commitTransaction();
		return order;
	}

	@Override
	public OrderDetails searchOrder(int id) {
		ori.beginTransaction();
		OrderDetails od = ori.searchOrderDetails(id);
		ori.commitTransaction();
		return od;
	}
	
	@Override
	public boolean cancelOrder(int id) {
		ori.beginTransaction();
		ori.deleteOrderDetails(id);
		ori.commitTransaction();
		return false;
	}
	
	@Override
	public Item addItem(Item item) {
		iri.beginTransaction();
		iri.addItem(item);
		iri.commitTransaction();
		return null;
	}

}
