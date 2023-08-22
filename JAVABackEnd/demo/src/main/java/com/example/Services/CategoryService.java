package com.example.Services;

import java.util.List;

import com.example.Entity.Category;

public interface CategoryService {

	void deleteCategory(int categoryId);

	Category updateCategory(int categoryId, Category updatedCategory);

	Category addCategory(Category category);

	Category getCategoryById(int categoryId);

	List<Category> getAllCategorys();



	

}
