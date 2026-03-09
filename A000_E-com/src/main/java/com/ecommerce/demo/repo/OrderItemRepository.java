package com.ecommerce.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.demo.model.*;
import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrder(Order order);
}