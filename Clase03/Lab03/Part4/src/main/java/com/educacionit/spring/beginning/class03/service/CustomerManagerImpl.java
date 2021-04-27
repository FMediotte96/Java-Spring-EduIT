
package com.educacionit.spring.beginning.class03.service;


import org.springframework.transaction.annotation.Transactional;

import com.educacionit.spring.beginning.class03.dao.CustomerDAO;
import com.educacionit.spring.beginning.class03.model.Customer;


public class CustomerManagerImpl implements CustomerManager {

	private CustomerDAO customerDAO;
	
	public CustomerManagerImpl () {
		
		super ();
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	@Transactional
	public void createCustomer(Customer cust) {
		customerDAO.create(cust);
	}

}