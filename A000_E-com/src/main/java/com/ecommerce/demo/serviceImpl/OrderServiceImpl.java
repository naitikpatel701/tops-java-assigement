package com.ecommerce.demo.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.dto.OrderDto;
import com.ecommerce.demo.dto.OrderItemDto;
import com.ecommerce.demo.dto.UserDto;
import com.ecommerce.demo.model.Order;
import com.ecommerce.demo.model.OrderItem;
import com.ecommerce.demo.model.User;
import com.ecommerce.demo.repo.OrderItemRepository;
import com.ecommerce.demo.repo.OrderRepository;
import com.ecommerce.demo.service.OrderService;

@Service
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
		
		List<Order> orders=repo.findByUser(mapper.map(dto, User.class));
		List<OrderDto> items=orders.stream().map(ord->{
			return mapper.map(ord, OrderDto.class);
		}).collect(Collectors.toList());
		return items;
	}

}
