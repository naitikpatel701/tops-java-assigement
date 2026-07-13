package com.ecommerce.demo.service;

import java.util.List;

import com.ecommerce.demo.dto.CartDto;
import com.ecommerce.demo.model.User;

public interface CartService {

	public CartDto create(CartDto dto);
	public List<CartDto> list();
	public CartDto cartbyUser(User user);
	public void delete(Long id);
}
