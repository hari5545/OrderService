package com.orderItems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderItems.entity.OrderDetailsEntity;

public interface OrderItemsRepository extends JpaRepository<OrderDetailsEntity, Integer>  {

}
