package com.example.Services;

import java.util.List;

import com.example.Entity.Product;

public interface ProductService 
{

	List<Product> getAllProducts();

	Product getProductById(int productId);

	Product addProduct(Product product);

	void deleteProduct(int productId);

	Product updateProduct(int productId, Product updatedProduct);
	
	List<Product> findProductsCheaperThan(double price);

	double getTotalOfCostAlllProducts(double offerPrice);

	

}
