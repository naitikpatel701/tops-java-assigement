package com.ecommerce.demo.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.demo.dto.OrderDto;
import com.ecommerce.demo.dto.OrderItemDto;
import com.ecommerce.demo.dto.UserDto;
import com.ecommerce.demo.model.Order;
import com.ecommerce.demo.model.OrderItem;
import com.ecommerce.demo.repo.OrderItemRepository;
import com.ecommerce.demo.repo.OrderRepository;
import com.ecommerce.demo.service.OrderService;

public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepository repo;
	
	@Autowired
	OrderItemRepository itemRepository;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public OrderDto create(OrderDto dto) {
		
		Order created=repo.save(mapper.map(dto, Order.class));
		return mapper.map(created, OrderDto.class);
	}

	@Override
	public OrderItemDto create(OrderItemDto dto) {
		
		OrderItem created=itemRepository.save(mapper.map(dto, OrderItem.class));
		return mapper.map(created, OrderItemDto.class);
	}

	@Override
	public List<OrderDto> list(UserDto dto) {
		
		List<Order> orders=repo.findByUserId(null);
		return null;
	}

}
