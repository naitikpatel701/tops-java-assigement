package com.ecommerce.demo.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.dto.CartItemDto;
import com.ecommerce.demo.model.CartItem;
import com.ecommerce.demo.repo.CartItemRepository;
import com.ecommerce.demo.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	CartItemRepository repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public CartItemDto create(CartItemDto dto) {
		// TODO Auto-generated method stub
		
		CartItem item=mapper.map(dto, CartItem.class);
		CartItem created=repo.save(item);
		return mapper.map(created, CartItemDto.class);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
