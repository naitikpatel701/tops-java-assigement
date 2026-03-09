package com.ecommerce.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.demo.model.*;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
	  List<Order> findByUserId(Long userId);
}