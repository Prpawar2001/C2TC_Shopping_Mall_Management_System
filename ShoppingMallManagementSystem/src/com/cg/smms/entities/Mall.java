package com.cg.smms.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="mall")
public class Mall implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mall_id")
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mallAdmin_id")
	private MallAdmin mallAdmin;
	
	@Column(name="mall_name")
	private String mallName;
	
	@Column(name="location")
	private String location;
	
	@OneToMany(mappedBy="mall",cascade=CascadeType.ALL)
	private List<Shop> shop = new ArrayList<>();
	
	@Column(name="categories")
	private String categories;
	
//	** Getters and Setters **
	
	public long getId() {
		return id;
	}
	public MallAdmin getMallAdmin() {
		return mallAdmin;
	}
	public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}
	public void setId(int id) {
		this.id = id;
	}

//	public MallAdmin getMallAdmin() {
//		return mallAdmin;
//	}
//	public void setMallAdmin(MallAdmin mallAdmin) {
//		this.mallAdmin = mallAdmin;
//	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Shop> getShop() {
		return shop;
	}
	public void setShop(List<Shop> shop) {
		this.shop = shop;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	
	public void addShop(Shop shop) {
		shop.setMall(this);
		this.getShop().add(shop);
	}
	
}
