package com.visualize.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visualize.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
