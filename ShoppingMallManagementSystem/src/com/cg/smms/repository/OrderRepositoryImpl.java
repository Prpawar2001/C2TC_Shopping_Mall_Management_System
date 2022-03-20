package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.OrderDetails;

public class OrderRepositoryImpl implements IOrderRepository {

	EntityManager entityManager;
	public OrderRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public OrderDetails addOrderDetails(OrderDetails orderDetails) {
		entityManager.persist(orderDetails);
		return orderDetails;
	}
	@Override
	public OrderDetails updateOrderDetails(OrderDetails orderDetails) {
		entityManager.merge(orderDetails);
		return orderDetails;
	}
	@Override
	public OrderDetails searchOrderDetails(int id) {
		OrderDetails od = entityManager.find(OrderDetails.class, id);
		return od;
	}
	@Override
	public OrderDetails deleteOrderDetails(int id) {
		OrderDetails od = entityManager.find(OrderDetails.class, id);
		entityManager.remove(od);
		return od;
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
}
