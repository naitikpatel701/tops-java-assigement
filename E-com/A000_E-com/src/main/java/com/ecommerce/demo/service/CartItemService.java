package com.ecommerce.demo.service;

import com.ecommerce.demo.dto.CartItemDto;

public interface CartItemService {

	public CartItemDto create(CartItemDto dto);
	public void delete(Long id);
}
