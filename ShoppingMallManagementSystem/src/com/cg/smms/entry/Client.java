package com.cg.smms.entry;

import com.cg.smms.entities.*;
import com.cg.smms.exception.*;
import com.cg.smms.repository.*;
import com.cg.smms.service.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
	
	
	public static void main(String[] args) throws Exception {
		
//		Customer CRUD operation
		
//		CustomerRepositoryImpl cri = new CustomerRepositoryImpl();
//		CustomerServiceImpl csi = new CustomerServiceImpl();
//		Customer c = new Customer();
//		c.setId(1);
//		c.setName("Aadesh");
//		c.setPhone("9876543210");
//		c.setEmail("Aakash@gmail.com");
//		cri.beginTransaction();
//		c = cri.searchCustomer(4);
//		System.out.println(c.getId() + c.getName());
//		cri.deleteCustomer(1);
//		cri.commitTransaction();
		
//		Employee CRUD operation
		
//		EmployeeServiceImpl esi = new EmployeeServiceImpl();
//		Employee e = new Employee();
//		e.setName("Prathamesh");
//		LocalDate date = LocalDate.now();
//		e.setDate(date);
//		e.setSalary(500);
//		e.setAddress("Thane");
//		e.setDesignation("Manager");
//		esi.addEmployee(e);
//		esi.deleteEmployee(1);
		
//		Item CRUD operation
		
//		OrderServiceImpl osi = new OrderServiceImpl();
//		ItemRepositoryImpl iri = new ItemRepositoryImpl();
//		Item i = new Item();
//		i.setId(1);
//		i.setName("pencil");
//		LocalDate datem = LocalDate.of(2021, 10, 12);
//		LocalDate datee = LocalDate.of(2021, 1, 20);
//		i.setManufacturing(datem);
//		i.setExpiry(datee);
//		i.setCategory("education");
//		i.setPrice(5);
//		iri.beginTransaction();
//		iri.deleteItem(2);
//		iri.commitTransaction();
		
//		Mall CRUD operations
		
//		MallRepositoryImpl mri = new MallRepositoryImpl();
//		Mall m =new Mall();
//		
//		m.setMallName("Korum");
//		m.setLocation("Thane");
//		m.setCategories("All");
//		mri.beginTransaction();
//		mri.addMall(m);
//		mri.commitTransaction();
		
//		MallAdmin CRUD operation
		
//		MallAdminRepositoryImpl mar = new MallAdminRepositoryImpl();
//		MallAdmin ma = new MallAdmin();
//		ma.setId(1);
//		ma.setName("Prathamesh");
//		ma.setPassword("pass321");
//		ma.setPhone("9136504468");
//		mar.beginTransaction();
//		mar.updateMallAdmin(ma);
//		mar.commitTransaction();
		
//		OrderDetails CRUD operation
		
//		OrderRepositoryImpl ori = new OrderRepositoryImpl();
//		OrderDetails od = new OrderDetails();
//		LocalDate date = LocalDate.now();
//		od.setDateOfPurchase(date);
//		od.setTotal(5000);
//		od.setPaymentMode("Online");
//		ori.beginTransaction();
//		ori.addOrderDetails(od);
//		ori.commitTransaction();
		
//		Shop CRUD operations
		
//		ShopRepositoryImpl sri = new ShopRepositoryImpl();
//		Shop s = new Shop(); 
//		s.setShopName("Paint brush");
//		s.setShopCategory("decoration");
//		s.setCustomers("Wrong");
//		s.setShopStatus("open");
//		s.setLeaseStatus("pending");
//		sri.beginTransaction();
//		sri.addShop(s);
//		sri.commitTransaction();
		
//		ShopOwner CRUD operation
		
//		ShopOwnerRepositoryImpl sori = new ShopOwnerRepositoryImpl();
//		ShopOwner so = new ShopOwner();
//		so.setName("Prathamesh");
//		LocalDate date = LocalDate.of(2001, 01, 25);
//		so.setDob(date);
//		so.setAddress("Thane");
//		sori.beginTransaction();
//		sori.addShopOwner(so);
//		sori.commitTransaction();
		
//		User CRUD operation
		
//		UserRepositoryImpl uri = new UserRepositoryImpl();
//		User u = new User();
//		u.setName("Prathamesh");
//		u.setPassword("1234");
//		u.setType("prime");
//		uri.beginTransaction();
//		User r = uri.searchUser(u);
////		System.out.println(r.getName());
//		uri.commitTransaction();
		
		
//   	**********  CRUD Operations Done  **********
		
//   	**********  Association Starts Here  **********
		
		
//		TO START WE HAVE TO CREATE A MALL FIRST  ------------------------------------------------------------------>
		
		
		
	}
}
