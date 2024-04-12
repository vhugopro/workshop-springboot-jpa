package com.visualize.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visualize.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
