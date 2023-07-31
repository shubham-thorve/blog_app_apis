package com.start.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.start.blog.entitites.Comments;

public interface CommentRepo extends JpaRepository<Comments, Integer>{

}
