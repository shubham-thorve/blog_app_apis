package com.start.blog.services;

import java.util.List;


import com.start.blog.payloads.CategoryDto;


public interface CategoryService {

	//CREATE
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//UPDATE
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//DELETE
	CategoryDto deleteCategory(Integer categoryId);
	
	//GET
	CategoryDto getCategoryById(Integer categoryId);
	
	//GET ALL
	List<CategoryDto> getCategories();

	CategoryDto createUser(CategoryDto categoryDto);
}
