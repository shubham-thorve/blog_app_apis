package com.start.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.start.blog.entitites.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
