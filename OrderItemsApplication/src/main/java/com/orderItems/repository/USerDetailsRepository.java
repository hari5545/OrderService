package com.orderItems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderItems.entity.UserDetailsEntity;

public interface USerDetailsRepository extends JpaRepository<UserDetailsEntity, Integer> {
	
}
