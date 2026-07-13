package com.ecommerce.demo.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.dto.CartDto;
import com.ecommerce.demo.model.Cart;
import com.ecommerce.demo.model.User;
import com.ecommerce.demo.payLoad.ResourceNotFoundException;
import com.ecommerce.demo.repo.CartRepository;
import com.ecommerce.demo.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	CartRepository repo;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public CartDto create(CartDto dto) {
		
		Cart c=mapper.map(dto, Cart.class);
		return mapper.map(repo.save(c), CartDto.class);
	}

	@Override
	public List<CartDto> list() {
		
	List<Cart> all=repo.findAll();
	List<CartDto> dtos=all.stream().map(c->{
		return mapper.map(c, CartDto.class);
	}).collect(Collectors.toList());
		return null;
	}


	@Override
	public CartDto cartbyUser(User user) {
		
		CartDto dt=null;
		Cart c=repo.findByUser(user);
		if(c!=null) {
			
			dt=mapper.map(c, CartDto.class);
		}
		return dt;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
