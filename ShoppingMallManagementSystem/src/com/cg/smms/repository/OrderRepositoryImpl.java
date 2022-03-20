package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.OrderDetails;
import com.cg.smms.exception.OrderCancelException;

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
		try {
			if(od==null) {
				throw new OrderCancelException("Order Details Not Found !!");
			}
			else {
				entityManager.remove(od);
			}
		}catch (OrderCancelException e)
		{
			System.out.println(e);
		}
		return null;
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
}
