package com.example.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Entity.Customer;
import com.example.Services.CustomerService;

@RestController
@RequestMapping("/api/Customer")
@CrossOrigin()
public class CustomerController {
	
	@Autowired
	private CustomerService manager;
	
	@GetMapping("/get")
	public ResponseEntity<?> getAllCustomers()
	{
		return new ResponseEntity<>(manager.getAllCustomers(),HttpStatus.OK);
	}
	
	@GetMapping("/getID/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable int id )
	{
		return new ResponseEntity<>(manager.getCustomerById(id),HttpStatus.OK);
	}
	
	@GetMapping("/getCustDetailByEmail/{cust_email}")
	public ResponseEntity<?> findCustomerByEmail(@PathVariable String cust_email )
	{
		return new ResponseEntity<>(manager.findCustomerByEmail(cust_email),HttpStatus.OK);
	}
	
	
	@PostMapping("/save")
	public  ResponseEntity<?>AddCustomer(@RequestBody Customer c)
	{
		return new ResponseEntity<>(manager.saveCustomer(c),HttpStatus.CREATED);
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<?> EditCustomer(@RequestBody Customer c,@PathVariable int id )
	{
		return new ResponseEntity<>(manager.update(c, id),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCustomer(@PathVariable int id)
	{
		manager.deleteCustomer(id);
	}
	

}