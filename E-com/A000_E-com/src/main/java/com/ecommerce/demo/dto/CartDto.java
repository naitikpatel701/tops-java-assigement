package com.ecommerce.demo.dto;

import java.time.LocalDateTime;

import java.util.List;

public class CartDto {
	
	private Long id;
	private UserDto user;
	private List<CartItemDtoView> items;
	private LocalDateTime  createdAt = LocalDateTime.now();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public List<CartItemDtoView> getItems() {
		return items;
	}
	public void setItems(List<CartItemDtoView> items) {
		this.items = items;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
    
}
