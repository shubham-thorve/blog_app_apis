package com.start.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.start.blog.entitites.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
