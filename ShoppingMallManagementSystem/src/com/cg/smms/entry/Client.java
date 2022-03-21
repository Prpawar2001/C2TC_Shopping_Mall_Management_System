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
//		System.out.println(r.getName());
//		uri.commitTransaction();
		
		
//   	**********  CRUD Operations Done  **********
		
//   	**********  Association Starts Here  **********
		
//		AdminServiceImpl asi = new AdminServiceImpl();
//		CustomerServiceImpl csi = new CustomerServiceImpl();
//		EmployeeServiceImpl esi = new EmployeeServiceImpl();
//		OrderServiceImpl osi = new OrderServiceImpl();
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		UserServiceImpl usi = new UserServiceImpl();
		
//		----------------------------------------  TO START WE HAVE TO CREATE A MALL FIRST  --------------------------------------------->

//		MallRepositoryImpl mallrepo = new MallRepositoryImpl();
//		
//		mallrepo.beginTransaction();
//		
//		User user = new User();
//		MallAdmin ma = new MallAdmin();
//		Mall mall = new Mall();
//		
////        Adding user details
//		user.setName("Akash");
//		user.setPassword("Ak01");
//		user.setType("Mall Admin");
//	
////    Adding MallAdmin details
//		ma.setName("Akash");
//		ma.setPassword("Ak01");
//		ma.setPhone("9856321475");
//		ma.setUser(user);
//		
////    Adding Mall details
//		mall.setMallName("Foodie");
//		mall.setCategories("Food");
//		mall.setLocation("Thane");
//		mall.setMallAdmin(ma);
//		
//		mallrepo.addMall(mall);                                   //  Adding Mall with MallAdmin details
//		System.out.println("New Mall is Added !!");		
//		mallrepo.commitTransaction();
		
//		-------------------------------------------  Let's Create Shops now for Mall  ------------------------------------------------>
		
////		Along with Shop we are Storing shop owner too
		
//		User user = new User();
//		ShopOwner so = new ShopOwner();
//		Shop shop = new Shop();
//		ShopOwnerRepositoryImpl soi = new ShopOwnerRepositoryImpl();
//		MallRepositoryImpl mri = new MallRepositoryImpl();
//		LocalDate date = LocalDate.of(2000, 10, 1);
//		
//		soi.beginTransaction();
//		
////		Adding user details
//		user.setName("Neeraj");
//		user.setPassword("Neyo01");
//		user.setType("Shop Owner");
//		
////		Adding mall details
//		Mall mall = mri.searchMall(2);                          //  getting the mall information with (id)
//		shop.setShopName("KFC");
//		shop.setShopCategory("Food");
//		shop.setShopStatus("Open");
//		shop.setLeaseStatus("Paid");
//		shop.setMall(mall);
//		
////		Adding Shop Owner details
//		so.setName("Neeraj");
//		so.setDob(date);
//		so.setAddress("Mumbai");
//		so.setUser(user);
//		so.setShop(shop);
//		
//		soi.addShopOwner(so);                                   //  Adding Shop with Shop Owner details
//		System.out.println("New shop is Added !!");		
//		soi.commitTransaction();
		
//		----------------------------------------------  Add Shop Employee  ----------------------------------------------------------->
		
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		LocalDate date = LocalDate.now();
//		
////		employee details (1)
//		Employee emp = new Employee();
//		emp.setName("Raj");
//		emp.setDate(date);
//		emp.setAddress("Thane");
//		emp.setDesignation("Manager");
//		emp.setSalary(1000);
//		
////		employee details (2)
//		Employee emp1 = new Employee();
//		emp1.setName("kiran");
//		emp1.setDate(date);
//		emp1.setAddress("Thane");
//		emp1.setDesignation("Salesman");
//		emp1.setSalary(400);
//		
//		Shop shop = ssi.searchShopById(1);                   //  Getting shop for adding employees
//		shop.addEmployee(emp);
//		shop.addEmployee(emp1);
//		
//		ssi.updateShop(shop);								 //  Updating shop (added employees)
//		System.out.println("Employees added Successfully");
		
//		----------------------------------------------  Add Shop Items  ----------------------------------------------------------->
		
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		ItemRepositoryImpl iri = new ItemRepositoryImpl();
		
//		Item details (1)
//		Item item = new Item();
//		item.setCategory("New");
//		item.setManufacturing(LocalDate.of(2022, 01, 01));
//		item.setExpiry(LocalDate.of(2032, 01, 01));
//		item.setName("LG Master");
//		item.setPrice(20000);
		
//		Item details (2)
//		Item item1 = new Item();
//		item1.setCategory("New");
//		item1.setManufacturing(LocalDate.of(2022, 01, 01));
//		item1.setExpiry(LocalDate.of(2032, 01, 01));
//		item1.setName("LG double door");
//		item1.setPrice(30000);
		
//		Shop shop = ssi.searchShopById(2);                            //  Getting shop for adding items
//		shop.addItems(item);
//		shop.addItems(item1);
		
//		ssi.addShop(shop);
		
//		Item item = iri.searchItem(4);	                              //  Update individual item
//		item.setCategory("New");
//		item.setShop(shop);
//		iri.beginTransaction();
//		iri.updateItem(item);
//		iri.commitTransaction();
		
//		ssi.updateShop(shop);                                          //  Updating shop (added items)
//		System.out.println("Items added Successfully");
		
		
//		-----------------------------------------------  Add Customer Details  --------------------------------------------------------->
	
//		CustomerRepositoryImpl cri = new CustomerRepositoryImpl();
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		Shop shop = ssi.searchShopById(1);                            //  Getting Shop details whose customer is creating
//		
////		Adding user details
//		User user = new User();
//		user.setName("Sneha");
//		user.setPassword("Sneha20");
//		user.setType("User");
//		
////		Adding customer details
//		Customer cust = new Customer();
//		cust.setName("Sneha");
//		cust.setEmail("Snehu@gmail.com");
//		cust.setPhone("8869547123");
//		cust.setUser(user);
//		cust.setShop(shop);
//		
//		cri.beginTransaction();
//		cri.addCustomer(cust);                                        //  Creating customer
//		cri.commitTransaction();
//		System.out.println("Customer added Successfully");	
		

//		------------------------------------------  User Login/LogOut Section  ----------------------------------------------------->
		
////		****  LogIn  ****
		
//		UserServiceImpl usi = new UserServiceImpl();
//		
//		User user = new User();
//		user.setId(8);
//		user.setPassword("sneha20");
//		usi.login(user);
//		System.out.println("done");
	
////		****  LogOut  ****
//		csi.logout();
		
//		----------------------------------------------  Customer Services   ----------------------------------------------------->
		
//		CustomerServiceImpl csi = new CustomerServiceImpl();
//		CustomerRepositoryImpl cri = new CustomerRepositoryImpl();	
//		ItemRepositoryImpl iri = new ItemRepositoryImpl();
//		LocalDate date = LocalDate.now();
//		OrderServiceImpl osi = new OrderServiceImpl();
		
//		iri.searchItemslist("la");                                  //  ***  Search list products using name ... ***

////		Customer Login
		
//		User user = new User();
//		user.setId(6);
//		user.setPassword("Sneha20");
//		user=csi.login(user);
//		Customer customer = user.getCustomer();
//		
//		if(customer==null)
//		{
//			System.out.println("Try Again !!!");
//		}else 
//		{
//			Item item = iri.searchItem(1);	
//			item.getName();
//			float t =item.getPrice();
//			Shop shop = item.getShop();
//			
//			OrderDetails od = new OrderDetails();
//			od.setDateOfPurchase(date);
//			od.setTotal(t);
//			od.setPaymentMode("Cash on Delivery");
//			od.setShop(shop);
//			od.setCustomer(customer);
//			osi.addOrder(od);                                       // adding Order
//			System.out.println("\nOrder Placed.....");
//		}
		
//		Cancel Order ----------------------------------------
		
//      osi.cancelOrder(5);                                         //  Order Cancel Exception Handled.......
		
//		Update Order ----------------------------------------
		
//		OrderDetails od = osi.searchOrder(2);
//		od.setPaymentMode("UPI Transaction");
//		osi.updateOrder(od);
		

//		---------------------------------------------- ** Personal Module : Employee ** ----------------------------------------------------->
	
//	    -------------  Add Employee----------------------------------------------------------------------------------------------->
		
//		EmployeeServiceImpl esi = new EmployeeServiceImpl();
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		LocalDate date = LocalDate.now();
//		
//		Shop shop = ssi.searchShopById(2);
//		
//		Employee emp = new Employee();
//		emp.setAddress("Mulund");
//		emp.setDate(date);
//		emp.setName("Raj");
//		emp.setDesignation("SalesMan");
//		emp.setSalary(4000);
//		emp.setShop(shop);
//		
//		Employee emp1 = new Employee();
//		emp1.setAddress("Bhandup");
//		emp1.setDate(date);
//		emp1.setName("Prakash");
//		emp1.setDesignation("Manager");
//		emp1.setSalary(6000);
//		emp1.setShop(shop);
//		
//		esi.addEmployee(emp);
//		esi.addEmployee(emp1);
//		
//		System.out.println("Employees added");
		
//		-------------  Update Employee------------------------------------------------------------------------------------------>
		
//		EmployeeServiceImpl esi = new EmployeeServiceImpl();
//		ShopServiceImpl ssi = new ShopServiceImpl();
//		LocalDate date = LocalDate.now();
//		
//		Employee emp = esi.searchEmployee(4);
//		
//		emp.setName("Om");
//		emp.setSalary(10000);
//		
//		esi.updateEmployee(emp);
//		
//		System.out.println("Employees updated\n");
//		
//		esi.searchEmployee(4);

//		--------------  Search Employee------------------------------------------------------------------------------------------>
		
//		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		
//		esi.searchEmployee(10);                                                 //  Object Not Found Exception handled here.....
//		esi.searchEmployee(1);
		
//		--------------  Delete Employee------------------------------------------------------------------------------------------>
		
//		EmployeeServiceImpl esi = new EmployeeServiceImpl();
//		
//		esi.deleteEmployee(6);
		
	}
	
}
