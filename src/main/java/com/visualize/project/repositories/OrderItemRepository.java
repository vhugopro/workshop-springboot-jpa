package com.visualize.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visualize.project.entities.OrderItem;
import com.visualize.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
