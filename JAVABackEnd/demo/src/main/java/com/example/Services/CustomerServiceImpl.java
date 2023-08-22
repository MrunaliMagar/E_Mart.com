package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Customer;
import com.example.Entity.Product;
import com.example.Repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerRepository customerRepo;
	

	public Customer saveCustomer(Customer c)
	{
		return customerRepo.save(c);
	}
	
	 public Customer getCustomerById(int cid)
	 {
		return customerRepo.findById(cid).get();
	 }
	
	public List<Customer>getAllCustomers()
	{
		return customerRepo.findAll();
	}
	
	
	public void deleteCustomer(int id)
	{
		Customer cust = customerRepo.findById(id).get();
		
		if(cust!=null) {
		 customerRepo.delete(cust);
		}
	}
	
	
	public Customer update(Customer c,int cid)
	{
		
		 Customer cust = customerRepo.findById(cid).get();
		 cust.setCustName(c.getCustName());
		 cust.setCustPhone(c.getCustPhone());
		 cust.setCustAddress(c.getCustAddress());
		 cust.setCustEmail(c.getCustEmail());
		 return customerRepo.save(cust);
		
	}

	@Override
    public Customer findCustomerByEmail(String custEmail) {
        return customerRepo.findCustomerByEmail(custEmail);
    }

	
	

	
	
	
	
	
	
	
	
}
