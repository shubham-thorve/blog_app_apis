package com.start.blog.services;

import java.util.List;


import com.start.blog.payloads.PostDto;
import com.start.blog.payloads.PostResponse;

public interface PostService {
	
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	//update
	PostDto updatePost(PostDto postDto,Integer postId);
	//delete
	void deletePost(Integer postId);
	//get single post
	PostDto getPostById(Integer postId);
	//get all posts
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	//get posts by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	//get posts by user
	List<PostDto> getPostsByUser(Integer userId);	
	//search posts
	List<PostDto> searchPosts(String keyword);

}
