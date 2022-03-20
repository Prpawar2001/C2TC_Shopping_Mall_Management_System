package com.cg.smms.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="shop")
public class Shop implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="shop_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="shop_category")
	private String shopCategory;
	
	@Column(name="shop_name")
	private String shopName;
	
	@Column(name="shop_status")
	private String shopStatus;
	
	@Column(name="lease_status")
	private String leaseStatus;
	
	@OneToOne(mappedBy="shop")
	ShopOwner shopOwner;	
	
	@OneToMany(mappedBy="shop",cascade=CascadeType.ALL)
	private List<Employee> employee = new ArrayList<>();

	@OneToMany(mappedBy="shop",cascade=CascadeType.ALL)
	private List<Item> item = new ArrayList<>();
	
	@OneToMany(mappedBy="shop",cascade=CascadeType.ALL)
	private List<OrderDetails> orderDetails = new ArrayList<>();
	
	@OneToMany(mappedBy="shop",cascade=CascadeType.ALL)
	private List<Customer> customer = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="mall_id")
	private Mall mall;
	
//	** Getters and Setters **
	
	public int getShopid() {
		return id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ShopOwner getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}
	public void setShopid(int shopid) {
		this.id = shopid;
	}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Mall getMall() {
		return mall;
	}
	public void setMall(Mall mall) {
		this.mall = mall;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	
	public void addEmployee(Employee employee) {
		employee.setShop(this);
		this.getEmployee().add(employee);
	}
	
	public void addItems(Item item) {
		item.setShop(this);
		this.getItem().add(item);
		}
	
	public void addOrder(OrderDetails od) {
		od.setShop(this);
		this.getOrderDetails().add(od);
	}
	
}
