package com.ecommerce.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.dto.CartDto;
import com.ecommerce.demo.dto.CartItemDto;
import com.ecommerce.demo.dto.UserDto;
import com.ecommerce.demo.model.User;
import com.ecommerce.demo.service.CartItemService;
import com.ecommerce.demo.service.CartService;
import com.ecommerce.demo.service.ProductService;
import com.ecommerce.demo.service.UserService;

@RestController
@RequestMapping("/carts")
public class CartController {

	@Autowired
	CartService cartService;
	
	@Autowired
	UserService service;
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	CartItemService cartItemService;
	
	@PostMapping("/")
	public ResponseEntity<CartItemDto> create(@RequestBody CartItemDto dto,@RequestParam("product") Long id) {
		
		dto.setProduct(productService.retrive(id));
		
		UserDto user=service.retrive(6l);
		
		CartDto isExist=cartService.cartbyUser(mapper.map(user, User.class));
		if(isExist==null) {
			
			CartDto ct=new CartDto();
			ct.setUser(user);
			isExist=cartService.create(ct);
		}
		
		dto.setCart(isExist);
		
		CartItemDto created=cartItemService.create(dto);
		return new ResponseEntity<>(created,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<CartDto> list() {
		
		UserDto user=service.retrive(6l);
		CartDto c=cartService.cartbyUser(mapper.map(user, User.class));
		return new ResponseEntity<>(c,HttpStatus.OK);	
	}	
}
