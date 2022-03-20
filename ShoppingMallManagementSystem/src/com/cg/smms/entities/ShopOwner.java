package com.cg.smms.entities;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name="shop_owner")
public class ShopOwner implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="shopowner_id")
	private int id;                                         //  Primary Key
	
	@Column(name="name")
	private String name;
	
	@Column(name="dob")
	private LocalDate dob;
	
	@Column(name="address")
	private String address;
	
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
	private User user;                                      //  Foreign Key (User)
	
	@OneToOne(cascade=CascadeType.ALL)                      //  One to One mapping with Shop
	@JoinColumn(name="shop_id")
	private Shop shop;                                      //  Foreign Key (shop)

//	***  Getters and Setters  *** ------------------------------------------------------------>
	
	public int getId() {
		return id;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	public Shop getShop() {
//		return shop;
//	}
//
//	public void setShop(Shop shop) {
//		this.shop = shop;
//	}
	
}
