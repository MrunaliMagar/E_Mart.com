package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Entity.Cart;
import com.example.Services.CartService;

@RestController
@CrossOrigin
@RequestMapping("/api/cart")
public class CartController {

	@Autowired
	private CartService cartServ;
	
	@PostMapping("/save")
	public ResponseEntity<?> AddCart (@RequestBody Cart c){
		return new ResponseEntity<> (cartServ.saveCart(c),HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getAllCart (){
		return new ResponseEntity<> (cartServ.getAllCart(),HttpStatus.OK);
	}
	
	@GetMapping("/getID/{id}")
	public ResponseEntity<?> getCartByID(@PathVariable int id){
		return new ResponseEntity<> (cartServ.getCartById(id),HttpStatus.OK);
	}
	
	@GetMapping("/getTotalCost/{TotalCost}")
	public ResponseEntity<?> getTotalCostOfAllCarts(@PathVariable double TotalCost){
		return new ResponseEntity<> (cartServ.getTotalCostOfAllCarts(TotalCost),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCart(@PathVariable int id){
		cartServ.deleteCart(id);
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<?> editCart (@RequestBody Cart c,@PathVariable int id){
		return new ResponseEntity<> (cartServ.updateCart(c, id),HttpStatus.CREATED);
	}
}
