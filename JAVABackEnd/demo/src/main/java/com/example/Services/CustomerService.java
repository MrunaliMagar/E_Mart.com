package com.example.Services;

import java.util.List;

import com.example.Entity.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer c);
	public List<Customer>getAllCustomers();
	public void deleteCustomer(int cid);
	public Customer update(Customer c,int cid);
	public Customer getCustomerById(int cid);
	public Customer findCustomerByEmail(String cust_email);
	

}
