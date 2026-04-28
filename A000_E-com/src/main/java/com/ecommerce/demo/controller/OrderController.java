package com.ecommerce.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.demo.dto.AddressDto;
import com.ecommerce.demo.dto.CartDto;
import com.ecommerce.demo.dto.CartItemDtoView;
import com.ecommerce.demo.dto.OrderDto;
import com.ecommerce.demo.dto.OrderItemDto;
import com.ecommerce.demo.dto.UserDto;
import com.ecommerce.demo.model.User;
import com.ecommerce.demo.service.AddressService;
import com.ecommerce.demo.service.CartItemService;
import com.ecommerce.demo.service.CartService;
import com.ecommerce.demo.service.OrderService;
import com.ecommerce.demo.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	UserService service;
	
	@Autowired
	AddressService addressService;
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	CartService cartService;
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	CartItemService cartItemService;
	
	@PreAuthorize("hasRole('USER')")
	@PostMapping("/")
	public void create(@RequestBody OrderDto dto,@RequestParam("address") Long aid,HttpServletRequest req) {
		
		AddressDto address=addressService.retrive(aid);
		HttpSession session=req.getSession();
		String username=(String) session.getAttribute("user");
		UserDto user=service.byUsername(username);
		dto.setUser(user);
		dto.setAddress(address);
		
		OrderDto createdOrder=orderService.create(dto);
		CartDto cart=cartService.cartbyUser(mapper.map(user, User.class));
		
		OrderItemDto odto=new OrderItemDto();
		for(CartItemDtoView cartitem: cart.getItems()) {
			
			odto.setOrder(createdOrder);
			odto.setProduct(cartitem.getProduct());
			odto.setQty(cartitem.getQty());
			odto.setPrice(cartitem.getProduct().getPrice());
			
			orderService.create(odto);
			
			cartItemService.delete(cartitem.getId());
		}
		
		cartService.delete(cart.getId());
	}
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/")
	public ResponseEntity<List<OrderDto>> list(HttpServletRequest req) {
		
		HttpSession session=req.getSession();
		String username=(String) session.getAttribute("user");
		UserDto user=service.byUsername(username);
		List<OrderDto> all=orderService.list(user);
		
		return new ResponseEntity<>(all,HttpStatus.OK);
	}
}
