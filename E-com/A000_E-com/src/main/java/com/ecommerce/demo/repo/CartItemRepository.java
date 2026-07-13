package com.ecommerce.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.demo.model.*;
import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
	 List<CartItem> findByCartId(Long cartId);
}