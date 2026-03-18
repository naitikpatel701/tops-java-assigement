package com.ecommerce.demo.service;

import java.util.List;

import com.ecommerce.demo.dto.OrderDto;
import com.ecommerce.demo.dto.OrderItemDto;
import com.ecommerce.demo.dto.UserDto;

public interface OrderService {

	public OrderDto create(OrderDto dto);
	public OrderItemDto create(OrderItemDto dto);
	public List<OrderDto> list(UserDto dto);
}
