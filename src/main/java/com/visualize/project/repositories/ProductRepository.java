package com.visualize.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visualize.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
