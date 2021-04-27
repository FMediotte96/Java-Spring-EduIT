
package com.educacionit.spring.beginning.class03.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.educacionit.spring.beginning.class03.model.Address;
import com.educacionit.spring.beginning.class03.model.Customer;
import com.educacionit.spring.beginning.class03.service.CustomerManager;
import com.educacionit.spring.beginning.class03.service.CustomerManagerImpl;



public class TransactionManagerMain {
	
	
	public TransactionManagerMain () {
		
		super ();
	}
	
	private static Customer createMockCustomer() {
		
		Customer customer = new Customer();
		customer.setId(2);
		customer.setName("Raul Peña");
		
		Address address = new Address();
		address.setId(2);
		address.setCountry("Venezuela");
		
		address.setAddress("Avenida Nueva Granada");
		customer.setAddress(address);
		return customer;
	}



	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		CustomerManager customerManager = ctx.getBean("customerManager", CustomerManagerImpl.class);

		Customer cust = createMockCustomer ();
		customerManager.createCustomer(cust);

		ctx.close();
	}

	
}