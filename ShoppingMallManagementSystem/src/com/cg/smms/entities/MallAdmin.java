package com.cg.smms.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="mall_admin")
public class MallAdmin implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mallAdmin_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phone")
	private String phone;
	
	@OneToOne(cascade=CascadeType.ALL)                 //  One to One mapping with User
	@JoinColumn(name="user_id")                        
	private User user;                                 //  Foreign Key (User)
	
	@OneToOne(mappedBy="mallAdmin")                   //  One to One mapping with MallAdmin
    private Mall mall;              
	
//	***  Getters and Setters  *** ------------------------------------------------------------>
	
	public int getId() {
		return id;
	}
	public Mall getMall() {
		return mall;
	}
	public void setMall(Mall mall) {
		this.mall = mall;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
//	public Mall getMall() {
//		return mall;
//	}
//	public void setMall(Mall mall) {
//		this.mall = mall;
//	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	public Mall getMall() {
//		return mall;
//	}
//	public void setMall(Mall mall) {
//		this.mall = mall;
//	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
