package com.example.Repositories;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Entity.Cart;
import com.example.Entity.Product;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> 
{
	@Query(value = "SELECT * FROM Product WHERE mrp_price < :price", nativeQuery = true)
    List<Product> findProductsCheaperThan(@Param("price") double price);
	
	@Transactional
    public default Double getTotalCostOfAllProducts(@Param("OfferPrice") double OfferPrice) {
        return findAll().stream()
                .map(Product::getOfferPrice)
                .reduce(0.0, Double::sum);
        
    }
}
