package com.start.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.start.blog.entitites.Category;
import com.start.blog.entitites.Post;
import com.start.blog.entitites.User;
public interface PostRepo extends JpaRepository<Post, Integer> {
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findBypostTitleContaining(String postTitle);	
}
