package com.start.blog.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.start.blog.entitites.User;

public interface UserRepo extends JpaRepository<User, Integer>{
Optional<User> findByEmail(String email);
}
