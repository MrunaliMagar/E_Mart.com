package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Entity.Invoice;
import com.example.Services.InvoiceService;

@RestController
@CrossOrigin
@RequestMapping("/api/invoice")
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceServ;
	
	@PostMapping("/save")
	public ResponseEntity<?> AddInvoice (@RequestBody Invoice i){
		return new ResponseEntity<> (invoiceServ.saveInvoice(i),HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getAllCart (){
		return new ResponseEntity<> (invoiceServ.getAllInvoice(),HttpStatus.OK);
	}
	
	@GetMapping("/getID/{id}")
	public ResponseEntity<?> getInvoiceByID(@PathVariable int id){
		return new ResponseEntity<> (invoiceServ.getInvoiceById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteInvoice(@PathVariable int id){
		invoiceServ.deleteInvoice(id);
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<?> editInvoice (@RequestBody Invoice i,@PathVariable int id){
		return new ResponseEntity<> (invoiceServ.updateInvoice(i, id),HttpStatus.CREATED);
	}
	
}
