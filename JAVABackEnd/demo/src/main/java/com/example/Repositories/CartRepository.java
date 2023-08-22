package com.example.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Entity.Cart;
import com.example.Entity.Product;

import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface CartRepository extends JpaRepository<Cart,Integer> {
	
	@Transactional
    public default Double getTotalCostOfAllCarts(@Param("Total_Cost") double Total_Cost) {
        return findAll().stream()
                .map(Cart::getTotalCost)
                .reduce(0.0, Double::sum);
        
    }
}





    

