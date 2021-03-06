package com.orderItems.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderItems.entity.OrderDetailsEntity;
import com.orderItems.entity.UserDetailsEntity;
import com.orderItems.repository.OrderItemsRepository;
import com.orderItems.repository.USerDetailsRepository;

@Service
public class OrderItemsService {
	@Autowired
	OrderItemsRepository repository;
	
	@Autowired
	USerDetailsRepository userRepository;
	
	public Optional<OrderDetailsEntity> getORderDetails(int id) {
		return repository.findById(id);
	}
	public OrderDetailsEntity saveORderItems(OrderDetailsEntity entity) {
		return repository.saveAndFlush(entity);
	}
	
	public OrderDetailsEntity save(OrderDetailsEntity entity) {
		return repository.save(entity);
	}
	
	public Optional<UserDetailsEntity> getUserDetailEntity(int id) {
		return userRepository.findById(id);
	}
}
