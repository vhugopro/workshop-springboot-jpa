package com.visualize.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visualize.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
